package study20260112;

public class Student {
	
	static String schoolName; // 클래스변수
	
	public String name; // 인스턴스변수
	public String age; // 인스턴스변수
	private int tall; // 인스턴스변수
	private int grade = 100; // 인스턴스변수
	
	// 변수 초기화 순서
	//  명시적초기화 -> 초기화 블럭 -> 생성자메서드 
	
	{  //인스턴스 초기화 블럭을 이용한 변수 초기화
		name="이성계";
	}
	
	public Student() { }
	public Student(String name, String age, int tall) {
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	public Student(String name, int tall) {
		this.name = name;
		this.tall = tall;
	}
	
	// 클래스 객체에 저장되어있는 값을 출력할때 
	// 자바에서는 일반적으로 toString 메서드를 사용한다.
	public String toString() {
		return name+" : " +age+" : "+tall+" : " +grade;
	}
	
}






