package lecture;

public class IPhoneMessenger implements Messenger {

	public String getMessage() {
		return "iPhone";
	}
	
	public void setMessage(String msg) {
		System.out.println("iPhone���� �޽����� �����մϴ� : " + msg);
	}
	
	public void clearMessage() {
		System.out.println("�¿�� ���� ���ڿ��� ����ϴ�.");
	}
}