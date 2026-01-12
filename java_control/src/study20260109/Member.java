package study20260109;

public class Member {
	
	//클래스 변수
	static String dept; //학과명
	
	// 인스턴스 변수
	String name;
	private int age;
	String gender;
	int birthDate;
	
	public Member(){}  // 생성자메서드
	// 매개변수가 있는 생성자 메서드
	Member(String name, int age, String gender ) {
		this.name = name;
		this.age=age;
		this.gender = gender;
	}
	
	
	public String toString() {
		return "이름 : "+ name +" 나이 : "+ age+" 성별 : "+ gender+
				" 생년월일 : " + birthDate;
	}
	
}

/*
 	
 	제어자 
 	static
 		공통의  라는 뜻으로 사용되는 제어자이다. 
 		static변수와 static 메서드가 있다.
 		static 메서드에는 static변수만 사용가능
 		      인스턴스 변수는 사용불가 
 		모든 객체가 공유해야 하는 데이터가 필요한경우 이거나
 		클래스의 대표 데이터로 사용해야 하는경우
 		다중 접속에 의해  너무 많은 생성을 방지하기 위해
 		사용하는경우 
 	
 	
 	final 
 		변경할수 없는  이라는 뜻으로 사용되는 제어자이다. 
 		특정 데이터가 실수에 의해 변경 되지 않게 하고자 할때 사용
 		개발과정에서 다른 팀원이 데이터변경 시키지 못하게 하기 위한용도
 		
 	접근 제어자 
 	   권한 설정 하는거, 변수, 메서드, 클래스, 인터페이스 등에 사용된다.
 	
 		public
 			공공의  라는 뜻 으로 사용되는 제어자
 			
 		default
 			기본적으로 붙은 접근제어자 
 			default제어자가 붙으면  같은 패키지에서만 사용가능 
 		
 		protected
 			같은 패키지에서만 사용가능
 			단,  상속 관계일경우는 사용가능
 		
 		
 		private
 			클래스 내부에서만 사용가능
 			
 		
 	abstract 
 	 	추상화 
 		
 	
 	
 	자바 의 변수 종류  
 	인스턴스변수 : 클래스의 멤버변수, 객체 생성시 존재하는 변수
 	            객체 소멸시 같이 소멸 되는 변수 
 	            
 	지역변수 :  블럭 { }  영역에서 선언되는 변수 
 	         for(  )  소괄호 안에 선언되는변수
 	         void sum( int a, int b) 메서드의 매개변수
 	         
 	클래스 변수 :  클래스의 멤버변수, 프로그램 실행시 클래스정의를
 	            메모리(ram)에 로드(적재) 하면서 생성
 	            클래스 변수가 소멸하는 시점은 프로그램 종료
 	            클래스 변수는 객체들이  공유 하는 변수 이다.
 	
 
 */











