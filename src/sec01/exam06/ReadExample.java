package sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) throws Exception {
        // 데이터 출발지를 test3.db로 하는 바이트 기반 파일 입력 스트림을 생성
        InputStream is = new FileInputStream("C:/Temp/test3.db");

        byte[] buffer = new byte[5];

        int readByteNum = is.read(buffer,2,3);
        if(readByteNum != -1) {
            for (int i=0; i<buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }

        is.close(); // 입력 스트림을 닫음
    }
}
