package study20260108;

import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		// 영화관 좌석 예약 
		
		//  int[] seats = new int[50];
		
		// 0 : 빈좌석  ,  1 : 예약된 좌석 
		//  사용자(예약자)로부터  예약인원수를 입력받아  원하는 위치에 예약되게 하기
		//  단,  원하는 위치에 연속적으로 예약인원 수 만큼 빈자리가 없으면 좌석 없음 출력
		
		int[] seats = { 1,0,0,0,0,0,0,0,1,1,
						1,0,0,0,0,1,1,1,0,1,
						0,0,1,0,0,0,1,0,0,0,
						0,0,0,0,0,0,0,0,0,0,
						0,0,0,0,0,0,1,0,0,0};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("예약 인원수 : ");
		int personCnt = sc.nextInt(); 
		
		// 좌석 위치 입력받기  
		System.out.print("원하는 위치 입력 : ");
		int pos = sc.nextInt();
		
		
		for(int i=0; i<seats.length; i++) { // 영화관 좌석수 만큼 반복
			
			if( (i+1) == pos) { // 사용자가 입력한 원하는 위치 찾기 
				boolean check = false;
				for(int k=i; k< (i+personCnt); k++) {
					if( seats[k]==1) { check=true; break; }
				}
				if(check) {
					System.out.println("선택하신 위치는 연속좌석이 없습니다.");
					break; // 사용자가 원하는 위치는 예약이 불가
				}
				else { // 사용자가 원하는 위치에 예약이 가능
					for(int k=i; k< (i+personCnt); k++) {
						seats[k] = 1;
					}
				}
			}
			
		}
		
		// 예약 현황 보여주기 
		for(int s : seats) {
			if(s==0) {
				System.out.print("빈 ");
			}else if( s == 1) {
				System.out.print("예 ");
			}
			
		}
		

	}

}
