package chpt17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("홍길동", 85));
        studentsList.add(new Student("홍길동", 92));
        studentsList.add(new Student("홍길동", 87));

        //Student를 score 스트림으로 변환
        studentsList.stream()
                    .mapToInt(s -> s.getScore())
                    .forEach(score -> System.out.println(score));
    }
}
