package study20260106;

import java.util.Scanner;

public class LoopMain2 {

	public static Scanner scan = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
				
//		System.out.println("=========  숫자 야구 ==========");
		
//		int com1 = (int)Math.floor(Math.random()* 9 ) + 1, com2=0, com3=0;
//		
////		while(true) {  //  숫자 3개 중복없이 나오게 하기  
////			com2 =  (int)Math.floor(Math.random() * 9 ) + 1 ;
////			com3 =  (int)Math.floor(Math.random() * 9 ) + 1;
////			if(  com1 != com2 && com1 != com3 && com2 != com3  )   break;
////		}
//		
//		do {
//			com2 =  (int)Math.floor(Math.random() * 9 ) + 1 ;
//			com3 =  (int)Math.floor(Math.random() * 9 ) + 1;
//		}while( !(com1 != com2 && com1 != com3 && com2 != com3) );
//		
////		System.out.println(com1+" "+com2+" "+com3);
//		
//		while(true) {
//			int str=0 , ball=0;
//			System.out.print("1~9 중에 숫자 세개 입력 : ");
//			int user1 = scan.nextInt();
//			int user2 = scan.nextInt();
//			int user3 = scan.nextInt();
//			
//			if( com1 == user1 ) str++;
//			if( com2 == user2 ) str++;
//			if( com3 == user3 ) str++;
//			
//			if( user1 == com2 || user1 == com3) ball++;
//			if( user2 == com1 || user2 == com3 ) ball++;
//			if( user3 == com1 || user3 == com2 ) ball++;
//			
//			System.out.println(str+"스트라이크 , "+ball+"볼 , "+(3-str-ball)+"아웃");
//			if(str==3) {
//				System.out.println("정답!!!");
//				break;
//			}
//		}
//		
		
//		System.out.print("1~50 중 입력 : ");
//		int user = scan.nextInt();
//		
//		int min = 1,  max = 50;
//		
//		while(true) {
//			int com = (int)Math.floor(Math.random() * (max-min +1) ) + min;
//			
//			if( com > user ) {
//				System.out.println("DOWN");
//				max = com - 1;
//			}
//			if( com < user ) {
//				System.out.println("UP");
//				min = com+1;
//			}
//			if( user == com ) {
//				System.out.println(" 정답 !");
//				break;
//			}
//		}
		
		
		
		
//		int com = (int)Math.floor(Math.random() * 50 ) + 1;
//		
//		while(true) {
//			System.out.print("1~50 중 입력 : ");
//			int user = scan.nextInt();
//			
//			if( user > com ) {
//				System.out.println("DOWN");
//			}
//			if( user < com ) {
//				System.out.println("UP");
//			}
//			if( user == com ) {
//				System.out.println(" 정답 !");
//				break;
//			}
//		}
	}

}
