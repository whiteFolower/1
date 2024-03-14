package Bogang304._06_Class.singlten.service;

import java.util.List;

import javax.management.InstanceAlreadyExistsException;

import Bogang304._06_Class.singlten.BoardVo;
import Bogang304._06_Class.singlten.dao.BoardRepository;

public class BoardServiceImpl implements IBoardService {

	
	private BoardRepository dao = BoardRepository.getInstance();
	
	private static BoardServiceImpl Instance = null;
	private BoardServiceImpl () {}
	public static BoardServiceImpl getInstance() {
		if(Instance == null) {
			Instance = new BoardServiceImpl();
		}
		return Instance;
	}
	
	
	@Override
	public List<BoardVo> selectBoardList(){
		return dao.getBoardList();
	}

}
