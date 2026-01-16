package able;

public interface Actionable {

	public abstract void move(); 
	public void drink();  // abstract 생략가능
	
//	 public int num=0; //인스턴스변수 불가
//	public static int count=0;
//	
//	public final int a=20;
}

/*
 	인터페이스  
 	추상클래스의 일종 
 	기본적으로 추상메서드를 가진다. 
 	인스턴스 변수, 인스턴스 메서드 불가
 	static 변수, static 메서드, final 가능
 	
 	인터페이스 구현 하는 이유 
 	1. 프로그램 전반의 규칙을 강제 
 	2. 다형성
 	3. 다중 상속
 	
 		
 */
