package study20260106;

public class ArrayMain {

	public static void main(String[] args) {
		
		String a = "good";
		String aa = new String("member");
		
		System.out.println( aa +"    "+  a);
		
		
		String word = "i like banana";
		
		System.out.println( word );
		
		System.out.println( word.charAt(4)  );
		
		System.out.println( word.indexOf('b')  );
		
		System.out.println( word.substring(2)  );
		
		String name = "이순신-김유신-김춘추-이성계-박문수-박팽년";
		
		System.out.println( name );
		
		String[] names = name.split("-");
		// String[] names = {"이순신","김유신","김춘추","이성계","박문수","박팽년"};
		
		
		System.out.println( names[0] );
		
		 // 반복문으로  이름을  전부 출력하세요.(한줄에 하나씩)
		for( String wow : names) {
			if( wow.indexOf('신') != -1 )
				System.out.println( wow );
		}
		
		
		String[] fruits = {
				"사과", "딸기", "배","수박",
				"바나나","복숭아","파인애플", "아보카도",
				"오렌지","감","한라봉","망고"
				};
		
		// 문제1.  fruits 배열에서 과일이름이 3자 이상인것만 출력하세요.  (   length()  ) 
		
		for( String fruit : fruits ) {
			if( fruit.length() >= 3 ){
				System.out.println(fruit);
			}
		}
		
		// 문제2.  fruits 배열에서 딸기와 수박은 제외하고 출력하세요!
		for( String fruit : fruits ) {
			if( !fruit.equals("딸기") && !fruit.equals("수박"))
				System.out.println( fruit );
		}
		
		
		System.out.println("\n\n\n");
		
		// 과일을   한줄에  4개씩  세줄로  출력할 것이다.
		for( int i=0; i< fruits.length; i++) {
			if( i%4 == 0)
				System.out.println();
			
			System.out.print( fruits[i] +" ");
			
		}
		
		
		
//		int b;
//		
//		char c = 'a';
//		char[] temp = new char[5];
//		
//		temp[0] = 'g';  temp[1] = 'o'; temp[2] ='o'; temp[3] ='d';
//		
//		System.out.println( temp );
		
		
		
		
		
		
		
//		int[] arr = new int[5];
//		// arr 은 참조변수이다 .  참조 변수는 메모리주소를 저장할 수 있는변수이다.
//		// 배열의 인덱스는 0부터 시작이다. 
//		
//		System.out.println( arr );
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 55;
//		arr[3] = 11;
//		arr[4] = 99;
//		
//		System.out.println( arr[2] );
//		
//		for(int i=0; i< arr.length; i++ ) {
//			
//			System.out.println( arr[i] );
//		}
//		
//		for( int num : arr ) {  // 향상된 for 문
//			if( num >50 )
//				System.out.println( num );
//		}
//		
//		
//		
//		int[] arr2 = {10,20,30};
		
		
		

	}

}

/*
 	배열 - 동일한 데이터타입의  데이터 저장공간이 연속적으로 나열되어있는 구조 
 	
 
 
 */









