package bhhong.middletest;

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

class Employee extends Person {
	private String job;
	private String dept;
	private int salary;

	public Employee(String pnum, String name, int age, String job, String dept, int salary) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
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
		salary = (int) (salary + (salary * 0.1));
	}

}

class Designer extends Employee {
	private String language;
	private int workYear;

	public Designer(String pnum, String name, int age, String job, String dept, int salary, String language,
			int workYear) {
		super(pnum, name, age, job, dept, salary);
		this.language = language;
		this.workYear = workYear;
	}

	public String toString() {
		return super.toString() + " language: " + language + " workYear: " + workYear;
	}

	void show() {
		System.out.println(toString());
		// Employee 객체의 show를 ㄹ부르고 자신 객체에 대한 show 함수를 호출
	}
}

class Student extends Person {

	private String schoolName;
	private int schoolyear;
	private int scholarship;

	public Student(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship) {
		super(pnum, name, age);
		this.schoolName = schoolName;
		this.schoolyear = schoolyear;
		this.scholarship = scholarship;
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
		scholarship = (int) (scholarship + (scholarship * 0.1));
	}
}

class WorkStudent extends Student {
	private String Job;
	private int dayPay;

	public WorkStudent(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship,
			String Job, int dayPay) {
		super(pnum, name, age, schoolName, schoolyear, scholarship);
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
		dayPay = (int) (dayPay + (dayPay * 0.1));
	}
}

public class TestPersons {

	static void showAll(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			p[i].show();
		}
	}

	static void increaseAll(Person[] p) {
		for (int j = 0; j < p.length; j++) {
			p[j].increase();
		}
	}

	static void getData(Person[] p) {
		Employee e = new Employee("p01", "Hong", 10, "DB", "Design", 2000);
		Designer d = new Designer("p02", "Kim", 30, "A", "A2", 3000, "en", 3);
		Student s = new Student("p03", "Lee", 20, "PNU", 3, 200);
		WorkStudent w = new WorkStudent("p04", "Park", 25, "KSU", 3, 100, "PA", 10);
		p[0] = e;
		p[1] = d;
		p[2] = s;
		p[3] = w;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] setPerson = new Person[4];
		getData(setPerson);
		showAll(setPerson);
		increaseAll(setPerson);
		showAll(setPerson);

	}

}
