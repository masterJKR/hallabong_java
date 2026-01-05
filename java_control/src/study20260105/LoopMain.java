package study20260105;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {
		
//		for( int i = 1 ;  i<=10; i++ ) {
//			System.out.println( i );
//		}
	
//		for( int i=1; i<=100; i++ ) {
//			if( i%10 == 0)
//				System.out.println( i );
//		}
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		
//		for( int i=1; i<=num  ; i++) {
//			System.out.println( i );
//		}

		
		// 1부터 12까지 출력하는데 
		//  4의 배수에는 four 라고  출력하시오  
		
//		for( int i=1; i<= 12 ;  i++) {
//			if( i%4 == 0)
//				System.out.println("four");
//			else
//				System.out.println(i);
//		}
		
//		int count = 0;
//		
//		for( int i=1; i<=1000; i++) {
//		
//			if( i%17 == 0) {
//				count++;
//			}
//			
//		}
//		
//		System.out.println(" 17의 배수 : " +count +"개");
		
		
		// 문제 
		//  동전앞면 뒷면 맞추기 게임
		//  게임을 총 10판 진행 하기 
		//  게임에서  내가 맞춘 횟수는 총 몇번인지  출력하기
		
//		int ok = 0; // 내사 맞춘건지 누적저장 변수
//	
//		for( int i=1; i<= 10; i++) {
//			int coin = (int)Math.floor(Math.random() * 2) + 1;
//			// 1 - 앞면 ,  2- 뒷면
//			System.out.println("동전 앞면 뒷면 맞추기");
//			System.out.print("1-앞면, 2-뒷면 \n 입력 : ");
//			int user = scan.nextInt();
//			
//			if( user == coin ) {
//				System.out.println("맞추기 성공!!!");
//				ok++;
//			}else
//				System.out.println("맞추기 실패.....");
//		}
//		 System.out.println("내가 맞춘 횟수 : "+ ok);
//		
		
		
		//  무한 루프  -  반복문은 조건식이 참인경우에 계속 반복 수행을 한다. 
		//              무조건 참이 되게 조건식을 설정하면 무한 반복을 할수 있다.
		// 무한 루프는 지정된 회수가 없기에 멈추지 않고 계속 동작한다 .
		//  그래서 무한루프 구현시 특정 조건을 걸어 둔다.
		
		
//		for( ; true; ) {
//			
//		}
		
//		for(;;) {
//			;
//		}
		
//		while(true) {
//			System.out.println(" 나는 무한 루프이다. ");
//		}
		
//		int i = 10;
//		while(true) {
//			System.out.println( i );
//			i++;
//			if( i == 40 ) break;
//		}
		
//		while(true) {
//			int num = (int)Math.floor(Math.random()*20)+1;
//			System.out.println( num );
//			if( num == 11 ) break;
//		}
		
		int com = (int)Math.floor(Math.random() * 50 ) + 1;
		
		while(true) {
			System.out.print("1~50 중 입력 : ");
			int user = scan.nextInt();
			
			if( user > com ) {
				System.out.println("DOWN");
			}
			if( user < com ) {
				System.out.println("UP");
			}
			if( user == com ) {
				System.out.println(" 정답 !");
				break;
			}
		}
		
		
		
	}

}


/*
 	1월 5일 과제
 	
 	가위 바위 보 게임을  총 15판 진행 
 	게임을 진행 하면서 1판 끝날때 마다  
 	 몇승,  몇패, 몇무   출력하기
 	 
 	
 	
 	
 	
 	
 	반복문 - for, while, do~while
 	반복문이란 특정 코드를 정해진 횟수만큼 동작 시키는 과정 이다. 또는 횟수의 제한 
 	없이 동작 시 킬수 있다.
 	
 	for문
 	
 	for( 초기값 ;  조건식; 증감식){
 		반복 실행할 내용;
 		반복 실행 할 내용;
 	}
 	
 	for( int i=3;  i<=9; i = i+2){
 		
 	}
 	
 	1부터 시작하여 1씩 증가하는 형태로 반복문을 작성한다.  
 	그래야  몇번 반복 시킬것인지  작성하기도 편하고 파악하기도 빠르고
 	
 	
 	for( Member m : MemberList){
 	
 	}
 	
 */




