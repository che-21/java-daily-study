package chpt15.quiz.q7;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    //Board board = new Board("제목1-", "내용1");
    //ListExample에서 사용하려는 데이터가 main 메소드 안에 있으면 getBoardList()에서 접근할 수 없음
    public List<Board> getBoardList() {
        // 1.리스트 객체 생성
        List<Board> list = new ArrayList<>();

        // 2.Board 객체 추가
        list.add(new Board("제목1", "내용"));
        list.add(new Board("제목2", "내용"));
        list.add(new Board("제목3", "내용"));

        // 이렇게 작성하면 무한 재귀호출로 StackOverflowError 발생
        //public List<Board> getBoardList() { return getBoardList(); }

        // 3.생성된 리스트 반환
        return list;
    }
}
