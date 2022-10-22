package lsh.serialize;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private Date date = new Date();
	transient private int salary;	// 직렬화에서 제외

	public Member() {}
	public Member(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
}
