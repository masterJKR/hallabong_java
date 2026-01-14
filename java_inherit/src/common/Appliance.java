package common;

public abstract class Appliance {  // 가전 제품
	
	protected boolean onoff = false; // 전원 여부 
	protected String name; // 제품명 
	protected int powerCon; // 소비전력 
	
	protected Appliance() {}
	protected Appliance(String name, int powerCon) {
		this.name = name;
		this.powerCon = powerCon;
	}
	
	
	
	@Override
	public String toString() {
		return "Appliance [onoff=" + onoff + ", name=" + name + ", powerCon=" + powerCon + "]";
	}
	
	
	public abstract void power(); //추상메서드
	
	// 추상 메서드 가지고있는 클래스는   반드시  추상클래스여야만 한다.
}





