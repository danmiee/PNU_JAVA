package lecture;

public class LMSTest {

	public static void main(String[] args) {
		// 자식클래스를 담고있는 인스턴스 생성
		Employee e = new Employee("오정임",47,"입학처");	// 생성자 선언시 매개변수를 선언했다면 불러올 때 매개변수 기재해야함
		Professor p = new Professor("김푸름",52,"빅데이터");
		Student s = new Student("김유빈",20,"컴퓨터과학");
		
		// 자식클래스 내용 불러오기
		/* 생성자 및 매개변수 선언 전
		 
		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");
		
		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");
		
		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");
		
		*/
		// 자식클래스를 통해 부모클래스 메소드 출력하기
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());

	}

}
