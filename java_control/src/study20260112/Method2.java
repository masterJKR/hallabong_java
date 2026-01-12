package study20260112;

public class Method2 {

	public static void main(String[] args) {
		
		Vending orange = new Vending("쌕쌕 오렌지", 1500, 2);
		Vending top = new Vending("Top 블랙", 2700, 3);
		
		System.out.println( orange );
		System.out.println( top );

		
		orange.buy(2000);
		System.out.println( orange );
		top.buy(2000);
		System.out.println( top );
	}

}
