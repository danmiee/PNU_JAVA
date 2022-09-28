package lecture;

public class MessengerTest {

	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
//		Messenger m = new Messenger();
		// 인터페이스는 클래스같은 형태로 호출할 수 없다.
		Messenger.getConnection();
		/*
		 * 객체가 없는데 무슨일?
		 * getConnection은 Messenger에서 public static으로 정의되었음
		 * > static : 객체없이 호출 가능
		 */
//		iphone.
		System.out.println(iphone.getMessage());
		/*
		 * 사용할 수 있는 메소드가 내가 만든 것 외에도 여러개 있다.
		 * 안 만들었는데 왜?
		 * 자바에서는 기본적으로 Object 클래스를 부모클래스로 가짐
		 */
	}
}
