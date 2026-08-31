package chpt16.quiz.q8;

import java.util.function.Function;

public class Example {
    private static Student[] students = {
        new Student("홍길동", 90, 96),
        new Student("신용권", 95, 93)
    };

    // avg 메소드 작성
    public static double avg(Function<Student, Integer> function) {
        int sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }
        return (double) sum/students.length;
    }

    public static void main(String[] args) {
        //double englishAvg = avg( s -> s.getEnglishScore());
        //Q9. avg() 메소드의 매개값으로 람다식을 사용하지 않고 메소드 참조로 변경
        double englishAvg = avg(Student::getEnglishScore);

        System.out.println("영어 평균 점수: " + englishAvg);

        //double mathAvg = avg( s -> s.getMathScore());
        //Q9. avg() 메소드의 매개값으로 람다식을 사용하지 않고 메소드 참조로 변경
        double mathAvg = avg(Student::getMathScore);

        System.out.println("수학 평균 점수: " + mathAvg);
    }
}
