package products;

import common.Appliance;

public class Aircon  extends Appliance{ // 에어컨 

	public Aircon() {	}
	public Aircon(String name, int powerCon) {
		super(name, powerCon);  // 부모클래스의 생성자 메서드 
	}
	
	@Override
	public void power() {
		onoff = !onoff;
		if(onoff)  System.out.println("냉방 을 시작합니다. ");
		else System.out.println("자동건조를 시작합니다. 바이!");
	}
}
