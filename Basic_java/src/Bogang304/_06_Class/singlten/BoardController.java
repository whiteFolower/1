package Bogang304._06_Class.singlten;

import java.util.List;

import Bogang304._06_Class.singlten.service.BoardServiceImpl;
import Bogang304._06_Class.singlten.service.IBoardService;

public class BoardController {

	private IBoardService service = BoardServiceImpl.getInstance();

	public void selectBoardList() {
		List<BoardVo> boardList = service.selectBoardList();

		for (BoardVo board : boardList) {
			System.out.println("----------------------");
			System.out.println("번호 : " + board.getBoNo());
			System.out.println("제목 : " + board.getBoTitle());
			System.out.println("작성자 : " + board.getBoWriter());
			System.out.println("내용 : " + board.getBoContent());
			System.out.println("작성일  : " + board.getBoDate());
			System.out.println("조회수 : " + board.getBoHit());
			System.out.println("-------------------");
		}

	}
}
