package bhhong.middletest_interface;

abstract class Person {
	private String pnum;
	private String name;
	private int age;

	public Person(String pnum, String name, int age) {
		this.pnum = pnum;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "pnum: " + pnum + " name: " + name + " age: " + age;
	}

	abstract void show(); // toString() 호출하여 syso으로 처리

	abstract void increase(); // salary, scholarship, dayPay 10% 증가
}

class Employee extends Person implements Message {
	private String job;
	private String dept;
	private int salary;
	private String gender;

	public Employee(String pnum, String name, int age, String job, String dept, int salary, String gender) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
		this.gender = gender;
	}

	public String toString() {
		return super.toString() + " job: " + job + " dept: " + dept + " salary: " + salary;
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	@Override
	void increase() {
		// TODO Auto-generated method stub
		salary = (int) (salary * 1.1);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return gender;
	}

	@Override
	public void setMessage(String gender) {
		// TODO Auto-generated method stub
		System.out.println("gender: "+gender);
	}

}

class Designer extends Employee {
	private String language;
	private int workYear;

	public Designer(String pnum, String name, int age, String job, String dept, int salary, String gender, String language,
			int workYear) {
		super(pnum, name, age, job, dept, salary, gender);
		this.language = language;
		this.workYear = workYear;
	}

	public String toString() {
		return super.toString() + " language: " + language + " workYear: " + workYear;
	}

	void show() {
		System.out.println(toString());
		// Employee 객체의 show를 부르고 자신 객체에 대한 show 함수를 호출
	}
}

class Student extends Person implements Message{

	private String schoolName;
	private int schoolyear;
	private int scholarship;
	private String gender;

	public Student(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship, String gender) {
		super(pnum, name, age);
		this.schoolName = schoolName;
		this.schoolyear = schoolyear;
		this.scholarship = scholarship;
		this.gender = gender;
	}

	public String toString() {
		return super.toString() + " schoolName: " + schoolName + " schoolyearr: " + schoolyear + " scholarship: "
				+ scholarship;
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	@Override
	void increase() {
		// TODO Auto-generated method stub
		scholarship = (int) (scholarship * 1.1);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return gender;
	}

	@Override
	public void setMessage(String gender) {
		// TODO Auto-generated method stub
		System.out.println("gender: " + gender);
	}
}

class WorkStudent extends Student {
	private String Job;
	private int dayPay;

	public WorkStudent(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship, String gender,
			String Job, int dayPay) {
		super(pnum, name, age, schoolName, schoolyear, scholarship, gender);
		this.Job = Job;
		this.dayPay = dayPay;
	}

	public String toString() {
		return super.toString() + " Job: " + Job + " dayPay: " + dayPay;
	}

	void show() {
		System.out.println(toString());
	}

	void increase() {
		dayPay = (int) (dayPay * 1.1);
	}

	
}

public class TestPersons {

	static void getData(Person[] p) {
		Employee e = new Employee("p01", "Hong", 10, "DB", "Design", 2000, "F");
		Designer d = new Designer("p02", "Kim", 30, "A", "A2", 3000, "M", "en", 3);
		Student s = new Student("p03", "Lee", 20, "PNU", 3, 200, "F");
		WorkStudent w = new WorkStudent("p04", "Park", 25, "KSU", 3, 100, "M", "PA", 10);
		p[0] = e;
		p[1] = d;
		p[2] = s;
		p[3] = w;
	}
	
	static void showAll(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			p[i].show();
//			System.out.println(p[i].getMessage());
			// 추상클래스의 메소드는 호출할 수 있으나 인터페이스의 메소드는 호출할 수 없다.
		}
	}

	static void increaseAll(Person[] p) {
		for (int j = 0; j < p.length; j++) {
			p[j].increase();
		}
	}

	static void getMessageData(Message[] m) {
		Employee e = new Employee("p01", "Hong", 10, "DB", "Design", 2000, "F");
		Designer d = new Designer("p02", "Kim", 30, "A", "A2", 3000, "M", "en", 3);
		Student s = new Student("p03", "Lee", 20, "PNU", 3, 200, "F");
		WorkStudent w = new WorkStudent("p04", "Park", 25, "KSU", 3, 100, "M", "PA", 10);
		
		m[0] = e;
		m[1] = d;
		m[2] = s;
		m[3] = w;
	}
	
	static void messageShowAll(Message [] m) {
		for (int k = 0; k < m.length; k++) {			
			m[k].setMessage(m[k].getMessage());
			System.out.println(m[k].getMessage());
//			m[k].show();
			// 인터페이스의 메소드는 호출할 수 있으나 추상클래스의 메소드는 호출할 수 없다.
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Person[] setPerson = new Person[4];
			getData(setPerson);
			showAll(setPerson);
			
			System.out.println();
			
			increaseAll(setPerson);
			showAll(setPerson);
			
			System.out.println();
			
			Message[] setMessageData = new Message[4];
			getMessageData(setMessageData);		// get이 누락되면 가져올 수 있는 값이 없어서 null 에러 발생
			messageShowAll(setMessageData);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
