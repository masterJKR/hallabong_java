package dto;

import able.Actionable;
import able.CafeOrder;

public abstract class BaseOrder implements CafeOrder{

	protected String cafeName;
	protected String menuName; // 주문한 메뉴
	
	public BaseOrder(String cafeName, String menuName) {
		this.cafeName=cafeName;
		this.menuName=menuName;
	}
	
	@Override
	public void takeOrder() {
		System.out.println("["+cafeName+"]  주문접수 : "+menuName);
	}
	
}
