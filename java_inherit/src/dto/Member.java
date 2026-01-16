package dto;

import able.Actionable;

public class Member implements Actionable{
	
	private String memberId;
	private String name;
	private int age;
	public Member() {  }
	public Member(String memberId, String name, int age) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", name=" + name + ", age=" + age + "]";
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	@Override
	public void move() {
		System.out.println( name+" 걷기 시작 ");
		
	}
	@Override
	public void drink() {
		System.out.println( name +"님이 소주를 마셨습니다.");
		
	}
	
}
