package dto;

public class CoffeeOrder extends BaseOrder{

	public CoffeeOrder(String cafeName, String menuName) {
		super(cafeName, menuName);
	}

	@Override
	public void make() {
		 System.out.println("["+cafeName+"] 원두 갈기 -> 추출 중...");
	}

	@Override
	public void serve() {
		System.out.println("["+cafeName+"] "+menuName+" 제공 완료");
	}

}
