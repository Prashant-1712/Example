package ConstructorEx;

public class Student {
	
	int id;
	String name;
	long phoneno;
	public Student(int id, String name, long phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
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
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

//	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPhoneno()=" + getPhoneno() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
