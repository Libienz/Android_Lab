# Kotlin_LAB
코틀린 학습을 위한 레퍼지토리입니다.


basic_syntax package : 기본 문법에 대한 내용을 담은 package
  
OOP_kot : 코틀린의 객체지향적 부분과 람다 고차함수 제너릭등의 기능을 다뤄보는 패키지

coding_test : 코딩 테스트 문제 코틀린으로 풀어보기

3/25 학습내용 : 
  
    basic_syntax.Kotlin_1 : 주석, 들여쓰기, 변경가능한 변수 var 변경 불가능 변수 val
      
        val, var 타입 지정 안하는데 추론하는건가? --> 직접 지정할 수도 있지만 추론이 디폴트인듯 
        println은 자바와 마찬가지로 객체의 tostring()을 불러오는 건가?? --> 다큐먼트에는 System.out.println이 불려온다고 되어있음
      
    basic_syntax.Kotlin_2 : 여러가지 자료형과 명시적 형변환 그리고 ?를 통한 null가능성 체크
  
    basic_syntax.Kotlin_3 : if else else if 를 통한 controlflow와 switch문처럼 사용되는 when이라는 예약어
      
    basic_syntax.Kotlin_4 : if else else if 를 이용한 너무 간단한 학점 출력문제 
    
    basic_syntax.Kotlin_5 : list와 filter, 물음표와 느낌표, 반복문 , 서식지정자 비스무리한거
    
    basic_syntax.Kotlin_6 : 구구단 출력 실습
    
    basic_syntax.Kotlin_7 : List Map Set mutable의 의미 인덱싱 간단한 연산들
    
    basic_syntax.Kotlin_8 : while List Map Iterator
    
    basic_syntax.Kotlin_9 : Map에서 필요한 정보만 뽑아와서 출력하는 간단한 예제 
    
    basic_syntax.Kotlin_10 : 함수 사용 입력인자 주고 리턴해보기 ez
    
    basic_syntax.Kotlin_11 : 함수로 계산기 구현해보기
    
    basic_syntax.Kotlin_12 : 논리연산 and or
    
    basic_syntax.Kotlin_13 : 문자열 다루기 스플릿을 중심으로 스플릿이 배열을 반환하는 듯

3/26 학습내용 :
    
    OOP_kot.Kotlin_14 : 널체크를 위한 엘비스 연산자 사용방법 
    
    OOP_kot.Kotlin_15 : 최상위 클래스 같은 Any , 어떤 인스턴스? 타입인지 확인하는 is 캐스팅 하는 as
    
    OOP_kot.Kotlin_16 : 리스트 가공 여러가지 메소드와 필터를 통해서 참인 것들 골라내기, groupBy로 true, false나누기 
    
    OOP_kot.Kotlin_17 : 클래스의 멤버변수와 메소드 사용법 인스턴스의 개념은 없는건가?? 클래스 타입으로 변수 선언도 가능가능
    
    OOP_kot.Kotlin_18 : 오버로딩에 대한 실습 계산기
    
    OOP_kot.Kotlin_19 : 상속을 사용하는 예약어와 문법 open 
    
    OOP_kot.Kotlin_20 : 인스턴스의 메소드가 불린다! 상속과 오버라이딩 open키워드로 메소드 열어야 함
    
    OOP_kot.Kotlin_21 : 자식클래스로의 구현을 미루는 추상클래스와 추상 메소드 
    
    OOP_kot.Kotlin_22 : 인터페이스와 인터페이스가 유용하게 사용되는 예 Car를 기반으로 
    
    OOP_kot.Kotlin_23 : 기존 클래스와 toString에 차이점이 있는 데이터 클래스! 서버에서 데이터를 많이 받아올 때 사용한다. 
      
      데이터 클래스 이거 뭔 말인지..
    
    OOP_kot.Kotlin_24 : 중첩 클래스와 이너 클래스의 차이점 속에 있는 클래스들의 라이프사이클 차이에 의해서 변수 참조 가능성이 달라짐
    
      생성주기가 달라서 그런 거 맞겠지???
      
    OOP_kot.Kotlin_25 : 람다식 사용방법 두가지 방법 
      
      람다식 자바서 부터 봐왔지만 굳이 람다식으로 사용하는 이유가 있나 ..?
    
    OOP_kot.Kotlin_26 : 함수 안에 함수를 입력인자로 줄 수 있는 고차함수 입력인자로 들어갈 함수의 람다원형이 필요하다
    
      코틀린에서 더블콜론의 의미가 궁금하다.. 리플렉션? 함수 참조 등등의 말이 있던데.. 
    
    OOP_kot.Kotlin_27 : 제너릭 .. 어떤 타입이 들어와도 유하게 반응하고 싶을 때 사용 타입 캐스팅 일일이 할 필요 없고 컴파일 편하다
    
3/27 학습내용 :
    
    OOP_kot.Kotlin_28 : 싱글톤 패턴을 가능하게 하는 (인스턴스가 하나뿐인) object, 클래스 내부의 object을 위한 companion object
    
      companion object는 스태틱과 비슷하게 사용할 수 있지만 객체임을 주의하자 
     
    OOP_kot.Kotlin_29 : 선언만 하고 초기화를 나중에 하는 lateinit, lazyString 
    
      ??????????????????그냥 변수도 가능한 기능 아님? lazyString은 뭐야 
      
    OOP_kot.Kotlin_30 : infix function 
    
      ?????????????????????????????????????????
    
    OOP_kot.Kotlint_31 : let with run apply also
      ????????
      
    OOP_kot.Kotlint_32 : 나열해서 사용하는 열거형 enum 클래스 실습
    
    coding_test.
