package kr.or.ddit.Test;

import java.util.HashMap;
import java.util.Map;

import T

public class Test extends Testprint {
	
	private static final String ScanUtil = null;
	static public Map<String, Object> sessionStorage = new HashMap<>();
	TestService freeService = TestService.getInstance();
	
	public static void main(String[] args) {
		new Test().start();
	}
	
	private void start() {
		Test02 view = Test02.HOME;
		while(true) {
			switch(view ) {
			case HOME:
				view = home();
				break;
			case FREE_LIST:
				view = testList();
				break;
			case FREE_INSERT:
				view = testInsert();
				break;
			case FREE_DETAIL:
				view = testDetail();
				break;
			case FREE_UPDATE:
				view = testupdate();
				break;
			default:
				break;
				}
		}
	}

	private Test02 testInsert() {
		return Test02.FREE_LIST;
	}

	private Test02 testupdate() {
		return Test02.FREE_LIST;
	}

	private Test02 testDetail() {
		System.out.println("1. 게시판 수정");
		System.out.println("1. 게시판 삭제");
		System.out.println("1. 전체 게시판");
		int sel = ;
		return null;
	}

	private Test02 testList() {
		// TODO Auto-generated method stub
		return null;
	}

	private Test02 home() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
