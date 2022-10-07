package com.ruby.java.ch08.date_221005;

public class GalaxyMessenger implements Messenger {
	// 인터페이스는 함수이름만 있으므로 함수바디를 구현한 클래스를 만듦

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);
	}

	public void changeKeyboard() {
		System.out.println("키보드아이콘 터치후 키보드를 변경합니다.");
	}
	
}
