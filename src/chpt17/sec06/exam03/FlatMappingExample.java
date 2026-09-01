package chpt17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        //문장 스트림을 단어 스트림으로 변환
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");
        list1.stream().
                //Arrays.stream()메소드는 주어진 String[] 배열을 Stream<String>으로 만듦
                flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(word -> System.out.println(word));
        System.out.println();

        //문자열 숫자 목록 스트림을 숫자 스트림으로 변환
        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        list2.stream()
                .flatMapToInt(data -> {
                    //String[] 배열을 int[] 배열로 만듦
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for(int i=0; i<strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    //Arrays.stream() 메소드는 주어진 int[] 배열을 IntStream으로 만듦
                    return Arrays.stream(intArr);
                })
                .forEach(number -> System.out.println(number));
    }
}
