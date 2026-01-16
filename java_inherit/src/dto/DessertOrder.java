package dto;

public class DessertOrder extends BaseOrder{

	public DessertOrder(String cafeName, String menuName) {
		super(cafeName, menuName);
	}

	@Override
	public void make() {
		System.out.println("["+cafeName+"] 디저트 준비 -> 플레이팅 중...");
	}

	@Override
	public void serve() {
		System.out.println("["+cafeName+"] "+menuName+" 제공 완료 ");
	}

}
