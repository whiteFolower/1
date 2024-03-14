package Bogang304._06_Class.singlten;

public class BoardMain {

	public static void main(String[] args) {
		// 게시판 목록 데이터를 조회
		// 저장된 게시글 정보 모두를 가져온다.
		
		BoardController controller = new BoardController();
		controller.selectBoardList();
	}

}
