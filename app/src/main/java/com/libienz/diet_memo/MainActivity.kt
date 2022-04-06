package com.libienz.diet_memo

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.time.Month
import java.util.*

class MainActivity : AppCompatActivity() {

    val dataModels = mutableListOf<dataModel>()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef = database.getReference("message")

        val listView = findViewById<ListView>(R.id.mainLv)
        var adapter = ListViewAdapter(dataModels)
        listView.adapter = adapter
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (dataModelitem in snapshot.children) {
                    Log.d("Data",dataModelitem.toString())
                    dataModels.add(dataModelitem.getValue(dataModel::class.java)!!)
                }
                adapter.notifyDataSetChanged()
            }


            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

        val writeBtn = findViewById<ImageView>(R.id.icon)
        var dateText : String = ""
        var healthMemo : String = ""

        writeBtn.setOnClickListener {
            Log.d("WRITE CLICK", "Clicked")
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("운동 메모 다이얼로그")

            val mAlertDialog = mBuilder.show()
            val dateSelectBtn = mAlertDialog.findViewById<Button>(R.id.date_select_btn)


            dateSelectBtn!!.setOnClickListener {
                val today = GregorianCalendar()
                val year = today.get(Calendar.YEAR)
                val month = today.get(Calendar.MONTH)
                val date = today.get(Calendar.DATE)

                val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
                    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {

                        dateText = year.toString() +"년" + (month + 1).toString() + "월" + p3.toString() + "일"
                        dateSelectBtn.setText(year.toString() +"년" + (month + 1).toString() + "월" + p3.toString() + "일")
                    }

                },year,month,date)
                dlg.show()


            }
            val saveBtn = mAlertDialog.findViewById<Button>(R.id.save_btn)
            saveBtn?.setOnClickListener {
                val memo = mAlertDialog.findViewById<EditText>(R.id.memo)
                healthMemo = memo?.text.toString() //저장 버튼 눌렀을 때 있는 걸 가져와야 ..
                // Write a message to the database

                val model = dataModel(dateText,healthMemo)

                myRef.push().setValue(model) //푸쉬는 같은 값이 데이터베이스에 있어도 넣어줌

                mAlertDialog.dismiss()



            }
        }
    }
}