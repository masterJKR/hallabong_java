package study20260113;

import java.util.Scanner;

public class UserService {
	
	private Scanner sc = new Scanner(System.in);
	// 아이디 찾기 메서드 
	// 이름을 입력하여 아이디 찾기 할것이다. 
	public void findId(User[] users ) {
		System.out.println("====아이디 찾기====");
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		for( User user : users) { // 배열 5개 (User 객체) 순환
			//User객체의 name 값과  키보드로 입력한 이름 비교
			if( user.getName().equals(name)  ) { 
				System.out.println("ID : "+ user.getId() );
				break;
			}
		}
	}
	
	// 비밀번호찾기 메서드 
	// 아이디와  연락처를 입력하면 비밀번호를 변경 할 수 있다.
	public void findPassword(User[] users) {
		System.out.println("==== 비밀번호 찾기 ====");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("연락처 입력 : ");
		String tel = sc.nextLine();
		
		
	}
	
	
	
}
// 데이터 저장 관리하기 위한 클래스에서 
// 데이터 필터링 이나 , 파일저장(DB), 불러오기 
//  등등 을 수행 하지 않는다.  
//  데이터 저장 관리하기 위한 클래스에서는 
//  저장에 관해 메서드를 주로 만들고 
//  데이터 변환에 대해서만 만든다. 

