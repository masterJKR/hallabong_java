package study20260102;

public class MainMethod {

	public static void main(String[] args) {
		
		if( 10 < 5 ) {
			System.out.println( " 5보다 크다 ");
		}else {
			System.out.println( " 5보다 작다 ");
		}
		
		// 바이킹 탑승 가능 : 145cm 이상 
		
		int tall = 160;
		
		if( tall >= 145 ) {
			System.out.println("바이킹 탑승가능");
		} else {
			System.out.println("바이킹 탑승 불가");
		}
		
		
		int age = 33;
		
		if( (age/10) == 3  )  // age >= 30 && age < 40
			System.out.println("30대 이다");
		else
			System.out.println("20대 이다");
		
		
		//  주차장에  요금이  기본요금은 1000원이다.
		//  기본시간은 30분이다.
		// 10분 당 100원씩 추가  예)  39분은 1000원,  40분은 1100원
		//  단  4시간 이상 주차시  기본요금은 2500원이다.  
		//   예)  3시간 50분 (230분) -> 3000원 
		///       4시간 12분 ( 252분) -> 2600원
		
		
	}

}


/*  제어문 
	
	조건문  -  if   ,  switch  
	
	1.
	if ( 조건식 ) {
		조건식이 참일경우 실행할 코드 ;
	}
	
	2.
	if ( 조건식 ){
		조건식이 참일 경우 실행할 코드;
	}else{
		조건식이 거짓일 경우 실행 할 코드;ㅣ
	}


	3. 
	if( 조건식1 ) {
		조건식1이 참인 경우에 실행
	}else{
		조건식1이 거짓인 경우에 실행
		if( 조건식2 ){
			조건식2가 참인경우에 실행
		}
	}
	
	
	4. 
	if( 조건식1 ){
		조건식1이 참인경우 실행
	}else  if ( 조건식2 ){
		조건식2가 참인경우 실행
	}

*/







