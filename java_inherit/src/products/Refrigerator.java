package products;

import common.Appliance;

public class Refrigerator extends Appliance{ //냉장고

	public Refrigerator() {
		power();
	}
	
	@Override
	public void power() {
		System.out.println("냉장고가 가동을 시작합니다. ");
	}
}
