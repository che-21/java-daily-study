package chpt16.quiz.q4;

/*
* 다음 코드의 실행결과를 보고 빈 곳에 들어갈 람다식을 작성하시오.
 실행결과
 작업 스레드가 실행됩니다.
 작업 스레드가 실행됩니다.
 작업 스레드가 실행됩니다.
* */

public class Example {
    public static void main(String[] args) {
        Thread thread = new Thread(
          //이곳에 답 입력
          () -> {
              for(int i = 0; i < 3; i++){
                  System.out.println("작업 스레드가 실행됩니다.");
              }
          }
        );
        thread.start();
    }
}
