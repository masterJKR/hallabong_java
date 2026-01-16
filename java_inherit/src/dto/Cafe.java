package dto;

import able.CafeOrder;

public class Cafe {
	private String cafeName;
	private String[] menu;
	
	public Cafe(String cafeName, String[] menu) {
		this.cafeName= cafeName;
		this.menu=menu;
	}
	// 주문을 위해  메뉴 제공
	public void showMenu() {
		System.out.println("[ "+cafeName+" ] 메뉴판");
		for(String m : menu) {
			System.out.println( "_ "+ m );
		}
	}
	
	// 주문 하기
	public void order(String menuName) {
		// 원래는 여기 위치에  주문한 메뉴가 제공 가능한지 판단하는 if문 있어야함
		// 품절일수도 있으니 
		
		// OrderFactory클래스 는  주문을 받았을때  어떤 주문인지- 커피, 차, 디저트
		CafeOrder order = null;
		switch(menuName) {
			case "아메리카노":
			case "라떼":
				order = new CoffeeOrder(cafeName, menuName);
				break;
			case "녹차":
			case "홍차":
				order = new TeaOrder(cafeName , menuName);
				break;
			case "치즈케이크":
			case "티라미슈":
				order = new DessertOrder(cafeName, menuName);
				break;
			default:
				System.out.println("제공되지 않는 메뉴 입니다.");
		}
		//메뉴에 맞는 주문 시작하기
		if( order ==null ) return;
		
		order.takeOrder(); // 받기
		order.make();  //제조
		order.serve(); // 제공
		
	}
}






