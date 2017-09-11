JAVA Programing
----------------------------------------------------
#### 2017.09.11 6일차

###### 예제
____________________________________________________

  1. [Abstract & Inteface 사용 방법](https://github.com/Hooooong/DAY6_Abstract-Interface/tree/master/src/com/leeheungki/abstractExam)
  2. [Interface Callback 원리](https://github.com/Hooooong/DAY6_Abstract-Interface/tree/master/src/com/leeheungki/interfaceExam)

###### 공부내용
____________________________________________________

  - Abstract(추상) Class

    - Abstract(추상) Class 란?

      >  Abstract(추상)이란 여러 가지 사물이나 개념에서 공통되는 특성이나 속성 따위를 추출하여 파악하는 작용을 말하는데, JAVA에서의 Abstract(추상) Class란 어떠한 클래스들의 공통되는 특성을 추출하여 일종의 명세서를 작성한 Class 라고 할 수 있다.

      - Abstract(추상) Class 는 없거나 하나 이상의 Abstract(추상) Method를 가지고 있다.

      - Abstract(추상) Method는 안이 아직 구현되지 않은 abstract로 정의된 Method를 말한다.

      - Class 안의 Method가 하나라도 Abstract로 선언되어 있다면 Abstract(추상) Class 가 된다.

    - Abstract(추상) Class & Method 사용 방법

        ```java
        /*
         * 추상 클래스 선언
         */
        public abstract class Base {

        /*
         * 접근제한자  + abstract + type + 메소드명();
         */
         public abstract String tpye();

         /*
          * 물론 기본 메소드도 작성이 가능하다.
          */
          public String sound(){
            return new String("울다");

        }

        /*
         * 추상 클래스 또한 상속이 가능하다.
         */
        public abstact class Animal extends Base{

        }

        /*
         * 추상 클래스를 상속받으려면 extends란 단어를 써서 추상 클래스를 상속받는다.
         * 추상 클래스의 경우에는 다중 상속이 불가능하다.
         */
        class Dog extends Animal{
          String type;
          /*
           * 추상 클래스의 추상 메소드는 이름만 작성한 것이므로
           * 상속된 클래스에서 추상 메소드를 정의해줘야 한다.
           */
          @Override
          public String tpye(){
             type="강아쥐";
          }

          /*
           * 물론 기본 메소드도 Override가 가능하다.
           */
          @Override
          public String sound(){
            return tpye+"은 멍멍 울다.";
          }
        }
        ```

  - Interface(인터페이스)

    - Interface(인터페이스) 란?

      > [인터페이스 설명](https://github.com/Hooooong/DAY2_Change)

  - Abstract VS Interface

    > `Abstract`는 상속받아 기능을 이용하고 확장시키는데 있다면, `Interface`는 함수의 껍데기만 있는데, 그 함수의 구현을 강제하여 구현 객체의 같은 동작을 보장할 수 있다. 애매하지만 가장 큰 차이점은 `Abstract`는 다중 상속이 되지 않지만 `Interface`는 다중 상속이 가능하다.

    - `Abstract`

      > 추상클래스는 같은 종류나 행동들을 구현할게 많을 때, 추상메소드를 상속받는 자식클래스에서 구현할때 쓰고 상속에 대한 계층구조를 명확히 표현할때 추상클래스를 이용한다.<br>
      추상클래스는 일반 변수들과 일반 메소드들도 쓸 수 있고 아직 구현하지 않아도될 메소드는 사용하지 않아도 되므로 상황에 따라 편리하다.

    - `Interface`

      > 인터페이스는 디자인을 구성하는 요소들이 자주 바뀔때 쓰면 유용하고, 메소드 형태만 서로 공유해서 구현되는 상황일 때나 클래스 전체가 아닌 메소드들만 쓰고 싶을 때 인터페이스를 사용한다.<br> 인터페이스는 동시 개발이 가능하기 때문에 개발 시간을 많이 단축시킬수 있다. 인터페이스안의 메소드들은 내용이 없는 상태이나 메소드에 대한 결과값은 내용을 만들지 않아도 미리 알수 있으므로 인터페이스의 내용을 누군가가 구현하고 있는 동안에 다른 한사람은 그 메소드가 구현되고 나면 작동할 결과값으로 같은 시간에 다른 일을 할수 있으니 개발 작업이 한층 더 빨라질수 있다.
