package study20260108;

import study20260109.Member;

public class JavaClass2 {

	public static void main(String[] args) {
		
		Member member =new Member();
		member.name="이성계";
		
		Movie movie = new Movie();
		// new Movie()  생성자 메서드 
		
		System.out.println( movie.title);
		
		movie.title="아바타 불과재";
		movie.dir="카메론";
		movie.year=2026;
		movie.limitAge=12;
		System.out.println( movie.title);
		
		
		Movie movie2 = new Movie("굿포춘",2026);
		
		System.out.println( movie2.title );
		System.out.println( movie2.year);
		
		// Music 클래스의 객체 생성하여 
		// 음악제목, 가수, 재생시간(총몇분) 저장되게하기
		// 매개변수 있는 생성자 메서드로  데이터 저장하고
		// 출력하기  
		
		Music music = new Music("천상연", "이창섭", 4);
		
		System.out.println( music.title );
		System.out.println( music.artist);
		System.out.println( music.duration );
		
		Music music2 = new Music();
		
		
	}

}









