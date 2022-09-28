package lecture;

public interface Messenger {
// 왜 abstract class 아니고 interface?
	/*
	 * 다중상속(자식클래스가 여러개의 부모클래스를 갖는 것)
	 * 	- abstract class : 다중상속 불가
	 * 	- interface : 다중상속 가능
	 * 
	 * 꼭 필요한가?	필요한 경우가 있음
	 */
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	// final : 상수값

	public abstract String getMessage();

	public abstract void setMessage(String msg);

	public default void setLogin(boolean login) {
		log();
		if (login) {
			System.out.println("로그인 처리합니다.");
		} else {
			System.out.println("로그아웃 처리합니다");
		}
	}

	public static void getConnection() {
		System.out.println("network에 연결합니다.");
	}

	private void log() {
		System.out.println("start job!");
	}
}
