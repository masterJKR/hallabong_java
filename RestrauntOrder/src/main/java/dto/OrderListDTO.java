package dto;

public class OrderListDTO {
	private long id;
	private long orderId;
	private long menuId;
	private String orderedName;
	private int orderedPrice;
	private int amount;

	public OrderListDTO() {
		// TODO Auto-generated constructor stub
	}

	public OrderListDTO(long id, long orderId, long menuId, String orderedName, int orderedPrice, int amount) {
		this.id = id;
		this.orderId = orderId;
		this.menuId = menuId;
		this.orderedName = orderedName;
		this.orderedPrice = orderedPrice;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public String getOrderedName() {
		return orderedName;
	}

	public void setOrderedName(String orderedName) {
		this.orderedName = orderedName;
	}

	public int getOrderedPrice() {
		return orderedPrice;
	}

	public void setOrderedPrice(int orderedPrice) {
		this.orderedPrice = orderedPrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return String.format(
		        "{\"id\":%d, \"orderId\":%d, \"menuId\":%d, \"orderedName\":\"%s\", \"orderedPrice\":%d, \"amount\":%d}",
		        id, orderId, menuId, orderedName, orderedPrice, amount
		    );
	}

}
