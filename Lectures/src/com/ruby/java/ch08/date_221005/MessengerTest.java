package com.ruby.java.ch08.date_221005;

public class MessengerTest {

	public static void main(String[] args) {
	
/*(비교)	
 * GalaxyMessenger galaxy = new GalaxyMessenger();
 * Messenger test = new Messenger() {};
 *  - 익명클래스는 인스턴스 생성과 동시에 선언
 */
		Messenger test = new Messenger() {
			// 인터페이스에 대한 클래스(이름없음)를 만들고 객체(test)도 함께 생성
			
			@Override
			public void setMessage(String msg) {
				// TODO Auto-generated method stub
				System.out.println("test에서 메시지를 설정합니다 : " +msg);
			}
			
			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return "test";
				
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
		
	}
}
