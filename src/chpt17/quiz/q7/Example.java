package chpt17.quiz.q7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developers = list.stream()
                .filter(m -> m.getJob().equals("개발ㅂ자"))
                .toList();
        /* 내가 작성한 오답
        //// m은 Member 객체 전체인데 문자열과 .equals()로 직접 비교하여 false가 됨
        .filter(m -> m.job.equals("개발자")

        // .forEach()는 최종 연산자로 반환값이 void이므로 List<Member> developers 변수에 대입 불가
        // 이후 developers.stream 호출 시 컴파일 에러 발생
        .forEach(s -> System.out.println(s.getJob()));
        */
        developers
                .stream()
                .forEach(m -> System.out.println(m.getName()));
    }
}
