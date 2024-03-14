package Bogang304._06_Class.singlten.service;

import java.util.List;
import Bogang304._06_Class.singlten.BoardVo;

public interface IBoardService {
	//개발자 는 인터페이스면  클래스명 앞에'I'를 붙히는게 관습

	   public List<BoardVo> selectBoardList();  //껍데기 메소드
}
