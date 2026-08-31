package chpt16.quiz.q5;

/*
* 다음 코드의 실행결과를 보고 표시한 곳에 들어갈 람다식을 작성하시오.
 실행결과
 OK버튼을 클릭했습니다.
 Cancle 버튼을 클릭했습니다.
* */

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("OK버튼을 클릭했습니다.")); // 여기 작성
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다")); // 여기 작성
        btnCancel.click();
    }
}
