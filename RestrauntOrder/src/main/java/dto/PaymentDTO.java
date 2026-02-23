package dto;

import java.time.LocalDateTime;

public class PaymentDTO {
	private long id;
	private long orderId;
	private String payOption;
	private LocalDateTime createdAt;

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

	public String getPayOption() {
		return payOption;
	}

	public void setPayOption(String payOption) {
		this.payOption = payOption;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "PaymentDTO [id=" + id + ", orderId=" + orderId + ", payOption=" + payOption + ", createdAt=" + createdAt
				+ "]";
	}

	public PaymentDTO(long id, long orderId, String payOption, LocalDateTime createdAt) {
		this.id = id;
		this.orderId = orderId;
		this.payOption = payOption;
		this.createdAt = createdAt;
	}

	public PaymentDTO() {
	}

}
