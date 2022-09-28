package edu;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		90점이상=A / 80점이상=B / 70점이상=C / 60점이상=D / 그외=F

		int score = 90;
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
	}
}
