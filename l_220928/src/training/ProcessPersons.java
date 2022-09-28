package training;

class Person {
	private String pno;
	private String pname;
	private int age;
	
	// 생성자 overloading : 동일한 함수에 대해 호출되는 변수가 다름
	public Person() { 
//		System.out.println("default 생성자");
		pno = null; pname = null; age = 0;
	};
	public Person(String pn) {
		this(); // 기본생성자 불러오기
		pno = pn;
	}
	public Person(String pn, String name) {
		this(pn); // 기본생성자에 매개변수 넣어서 불러오기
		pname = name;
	}
	public Person(String pn, String name, int a) {
		this(pn,name);
		age = a;
//		pno = pn; pname = name; age = a;
	}
	
	public void show() {
		System.out.println("pno: " + pno + " pname: " + pname + " age: " + age);
	}
}

class Student extends Person {
	private String schoolName;
	private int schoolYear;
	public Student() { schoolName = null; schoolYear = 0; };
	public Student(String pn, String name, int a, String sname, int syear) {
		super(pn, name, a);
		schoolName = sname; schoolYear = syear;
	}
	
	// 생성자 overriding
	/*
	 * 동일한 변수를 사용해도 자식클래에서 정의한 것이 부모클래스에서 정의한 것보다 우선순위를 가짐
	 * super.메소드();
	 * 입력 시 부모클래스에서 정의된 메소드 사용
	 * super없이 사용하면 자기자신을 계속 반복하기 때문에 에러발생
	 */
	public void show() {
		super.show();
		System.out.println("sname: "+schoolName+" syear: "+schoolYear);
	}
}

class WorkStudent extends Student {
	private String job;
	private int salary;
	public WorkStudent() { job = null; salary = 0; };
	public WorkStudent(String pn, String name, int a, String sname, int syear, String j, int pay) {
		super(pn, name, a, sname, syear);
		job = j; salary = pay;
	}
	public void show() {
		super.show();
		System.out.println("job: "+job+" salary: " +salary);
	}
	
}

public class ProcessPersons {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 생성자 overloading
		Person p = new Person();
		Person p1 = new Person("p001");
		Person p2 = new Person("p002","Hong");
		Person p3 = new Person("p003","Kim",20);
//		System.out.println(p);
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
		
		Student s1 = new Student("p004","Lee",40,"신라대",5);
		
		WorkStudent ws = new WorkStudent("p001","Hong",30,"부산대",3,"code",1000);
		p3.show();
		System.out.println();
		s1.show();
		System.out.println();
		ws.show();
	}

}
