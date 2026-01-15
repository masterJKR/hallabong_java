package common;

public abstract class Animal {

	protected String name;
	public Animal(String name) {
		this.name= name;
	}
	public final void sleep() {
		System.out.println( name + "잠을 잔다.");
	}
	
	// 자식 클래스가 구현해야하는 규칙 
	public abstract void sound(); // 추상메서드
	
}
