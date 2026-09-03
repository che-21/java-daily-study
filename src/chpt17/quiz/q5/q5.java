package chpt17.quiz.q5;

import java.util.Arrays;
import java.util.List;

public class q5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                //알파벳이 모두 소문자로 나올 수 있도록 처리 + "java"라는 단어 포함하는지 확인
                .filter(s -> s.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}
