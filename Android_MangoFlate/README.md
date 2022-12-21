# Android_MangoFlate
웹뷰를 이용하여 컨텐츠를 보여주고 사용자의 마음에 드는 컨텐츠를 저장할 수 있는 어플리케이션


FireBase Auth
    
    프로젝트 시작해서 json 파일 끌어오고 안슈에서 tool -> firebase로 gradle 자동 설정
  
WebView
  
    xml에서 WebView 태그 생성 
    loadUrl manifest에서 userPermission 인터넷 설정 필요
  
FireBase RealTime Data

    북마크 데이터베이스에 uid기반으로 저장 
    북마크 읽어오기 
    

Glide
  
    imageSrc 가져와서 어플리케이션 내에 로드 할 수 있음 
    Gradle 수정 필요 Sync 구글링 해서 찾아보기

Splash Activity
    
    manifest파일 수정
    Handler 이용한 Splash Activity 
    만드는 방법 손에 익혀야 
  
RecyclerView
    
    main xml 파일에 리사이클러 뷰 만들기
    rv_item.xml 만들기 <-- 얘가 리사이클러 뷰에 한 칸씩 꽃힌다.
    RVAdapter만들기 얘가 데이터 바인딩 시킴 데이터 클래스로 넘겨주자
    리사이클러 onclick 하는 법 -> RVAdapter에 인터페이스 만들고 viewBindHolder에서 리슨
