package Bogang304._06_Class;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
	//나 자신에 인스턴스를 얻어올수 있도록 변수로 선언 및 초기화를 해준다
	
	private static BoardRepository instance = null;
	// 나자신을 생성자를 통해서 인스턴스를 만들지 못하게 한다.
	// new 를사욯해서 같은 이름을 생성하면 다른게이름으로 하나가 더 생성되게 된다 그래서 생성하지 못하게 한다
	
	private BoardRepository() {}
	//게시글 정보 1개를 초기화
	//BoardVO 클래스 선언해서 게시글 정보 1개를 만들어준다
	BoardVO boardVO = new BoardVO();

	
	
	//나 자신에 대한 인스턴스를 얻어올수 있는 방법은 오로지
	//메서드인 getinstance()라는 메소드로만 가능하다
	public BoardRepository getInstance() {
		if(instance== null) {
			instance = new BoardRepository(); //인스턴스가 널이면 새로운걸 만들고
		}
		return instance;  //값이 잇다면 리턴으로 인스턴스를 걸어 해당 값을 리턴한다
	}
	
	private List<BoardVO> boardList = new ArrayList<BoardVO>();
	
	
	
	
}
