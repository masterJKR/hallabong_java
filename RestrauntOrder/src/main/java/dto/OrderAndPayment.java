package dto;

import java.time.LocalDateTime;
import java.util.Map;

public class OrderAndPayment extends OrderDTO {
	private String pay_option;

	public String getPay_option() {
		return pay_option;
	}
	public void setPay_option(String pay_option) {
		this.pay_option = pay_option;
	}
	public OrderAndPayment() {
		// TODO Auto-generated constructor stub
	}
	public OrderAndPayment(long id, int price_total, String status, LocalDateTime created_at,
			Map<Long, OrderListDTO> orderMap, String pay_option) {
		super(id, price_total, status, created_at, orderMap);
		this.pay_option = pay_option;
	}

	@Override
	public String toString() {
		String str = super.toString();
		
		str = str.substring(0, str.length() - 1);
		
//		System.out.println(str);
		
		return str.concat( String.format(",\"pay_option\":\"%s\"}", pay_option));
	}
	
}
