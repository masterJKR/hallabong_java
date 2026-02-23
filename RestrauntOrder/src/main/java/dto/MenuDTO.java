package dto;

public class MenuDTO {
	private long id;
	private String menuName;
	private String menuImg;
	private int price;
	private String category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuImg() {
		return menuImg;
	}
	public void setMenuImg(String menuImg) {
		this.menuImg = menuImg;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public MenuDTO(long id, String menuName, String menuImg, int price, String category) {
		this.id = id;
		this.menuName = menuName;
		this.menuImg = menuImg;
		this.price = price;
		this.category = category;
	}
	@Override
	public String toString() {
		return String.format("{\"id\":%d,\"menuName\":\"%s\","
			+ "\"menuImg\":\"%s\",\"price\":%d,\"category\":\"%s\"}",
			id, menuName, menuImg, price, category);
	}
	
	
}
