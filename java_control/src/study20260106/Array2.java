package study20260106;

public class Array2 {

	public static void main(String[] args) {
		
//		int[] num1 = {10,20,30,50,80};
//		int[] num2 = {5,4,33,99,123};
//		
//		for(int i=0; i<num1.length; i++) {
//			System.out.println( num1[i] );
//			for( int k=0; k<num2.length; k++) {
//				System.out.println("   "+num2[k]);
//			}
//		}
		
		int[] bingo= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
				20,21,22,23,24,25
		};
		
		for(int i=0; i<5; i++) {
			for(int k=0; k<5; k++) {
				System.out.println(   bingo[i*5+k]  );
			}
		}
		
		
		
	}

}
