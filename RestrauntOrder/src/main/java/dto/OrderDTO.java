package dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.StringJoiner;

public class OrderDTO {
	private long id;
	private int price_total;
	private String status;
	private LocalDateTime created_at;
	private Map<Long, OrderListDTO> orderMap;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPrice_total() {
		return price_total;
	}

	public void setPrice_total(int price_total) {
		this.price_total = price_total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
	    // 1. 날짜 포맷팅 (JS에서 인식하기 쉬운 형태)
	    String dateStr = (this.created_at != null) 
	                     ? this.created_at.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) 
	                     : "";

	    // 2. Map<Long, OrderListDTO>을 JSON 객체 형식으로 변환
	    StringJoiner mapSj = new StringJoiner(",", "{", "}");
	    if (this.orderMap != null) {
	        for (Long key : this.orderMap.keySet()) {
	            // "Key": {OrderListDTO의 JSON} 형태로 추가
	            mapSj.add("\"" + key + "\":" +this.orderMap.get(key).toString());
	        }
	    }

	    // 3. 최종 전체 JSON 조립
	    return String.format(
	        "{\"id\":%d, \"price_total\":%d, \"status\":\"%s\", \"created_at\":\"%s\", \"orderMap\":%s}",
	        this.id, this.price_total, this.status, dateStr, mapSj.toString()
	    );
	}

	public OrderDTO(long id, int price_total, String status, LocalDateTime created_at, Map<Long, OrderListDTO> orderMap) {
		this.id = id;
		this.price_total = price_total;
		this.status = status;
		this.created_at = created_at;
		this.orderMap = orderMap;
	}

	public OrderDTO() {
	}

	public Map<Long, OrderListDTO> setOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<Long, OrderListDTO> orderMap) {
		this.orderMap = orderMap;
	}

}
