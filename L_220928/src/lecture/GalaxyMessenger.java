package lecture;

public class GalaxyMessenger implements Messenger {

	public String getMessage() {
		return "galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("galaxy���� �޽����� �����մϴ� : " + msg);
	}
	
	public void changeKeyboard() {
		System.out.println("Ű��������� ��ġ�� Ű���带 �����մϴ�.");
	}
}