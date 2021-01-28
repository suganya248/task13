package model;

public class Staff {
	private int id;
	private String name;
	private long salary;
	private int exp;

	public Staff(int id, String name, long salary, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.exp = exp;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Staff id=" + id + ", name=" + name + ", salary=" + salary + ", exp=" + exp ;
	}

}
