package study20260113;

public class Method4 {
	public static void main(String[] args) {
		
		DBConnect connect = new DBConnect();		
		
		Product[] products = connect.selectData();
		
//		System.out.println( products[0] );
		
		
	}
}
