package sec06.ch06;

public class Member {
	String id;
	String name;
	int age;
	
	public Member(String id) {
		this(id,"",0);
	}
	public Member(String id, String name) {
		this(id,name,0);
	}
	public Member(String id, String name, int age) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
