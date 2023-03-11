package study;

public class LamdaExam {

    /*
    *   인터페이스 중에서 메소드를 1개만 가지고 있는 인터페이스를
    *   '함수형 인터페이스' 라고 한다.
    *   ex) Runnable 인터페이스는 run()만 가지고 있으므로 함수형 인터페이스라 한다.
    * */
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i = 0 ; i < 10 ; i++) {
                    System.out.println(i + "");
                }
            }
        }).start();

        /*LAMDA가 필요한 이유
        *  자바는 메소드만 파라미터로 전달할 수 없다.
        *  따라서 함수형 인터페이스(메소드를 하나만 가지는 인터페이스)에서는
        *  '메소드'만 파라미터로 전달하는 것처럼 효과를 줄 수 있다.
        * */

        //TO LAMDA

        //Lamda : 익명 메소드
        new Thread(() -> {
            for(int i = 0 ; i < 10 ; i++) {
                System.out.println(i + "");
            }
        }).start();

        //람다식 문법
        /*
        *  (매개변수 목록) -> { 실행문 }
        * */
    }
}
