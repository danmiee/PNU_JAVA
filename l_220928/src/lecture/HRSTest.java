package lecture;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();
		/*
		 *  함수 이름만 있고 {body}가 없음 > 추상화
		 *  body는 어디? 상속받은 클래스에서 구현!
		 *  이런거 왜 씀? 메소드이름 통일시키려고
		 */
	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee {
	/*
	 * abstract 제거하려면 Employee의 calcBonus 구현 필요
	 */
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest {
	public static void main(String[] args) {
//		 Employee m = new Employee();
		/* Error
		 * Cannot instantiate the type Employee
		 * Employee는 abstract클래스임
		 * > abstract 지우면? abstract 메소드 존재(메소드가 아직 안 만들어졌음)
		 * > 메소드의 abstract 지우면? 메소드 {body} 정의해줘야함 
		 */
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
//		Manager m = new Manager();
		/* Error
		 * Cannot instantiate the type Manager
		 * abstract 클래스라서 안됨
		 * > abstract 지우면? employee에서 abstract된 메소드 정의해줘야함
		 */
		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
	}
}

//	추상클래스 주의사항
	/*
	 * 1. 메서드 선언 시 본문을 일부러 구현하지 않을 때 abstract로 선언해야함
	 * 2. abstract로 선언한 메소드는 메소드 본문 가질 수 없음
	 * 3. 추상 메소드를 포함하는 클래스는 선언부에 abstract 명시
	 * 4. 추상 클래스는 하나 이상의 추상 메소드가 있다는 의미
	 */