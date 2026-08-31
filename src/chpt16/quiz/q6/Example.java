package chpt16.quiz.q6;

/* 다음 코드를 보고 Function 함수형 인터페이스를 작성하시오.
* result: 2.5
* */
public class Example {
    public static double calc(Function fun) {
        double x = 10;
        double y = 4;
        return fun.apply(x,y);
    }

    public static void main(String[] args) {
        double result = calc((x,y) -> (x/y));
        System.out.println("result: " + result);
    }
}
