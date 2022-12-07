package java시험;

public class orderBuilder {
	
	private int orderId;
	private String productName;
	private String consumerName;
	private int price;
	private int stock;
	
	public orderBuilder orderId(int orderId ) {
		this.orderId = orderId;
		return this;
				
	}
	

	public orderBuilder productName(String productName ) {
		this.productName = productName;
		return this;
				
	}

	public orderBuilder consumerName(String consumerName ) {
		this.consumerName = consumerName;
		return this;
				
	}
	
	public orderBuilder price (int price ) {
		this.price = price;
		return this;
				
	}
	
	public orderBuilder stock (int stock) {
		this.stock = stock;
		return this;
	}
	
	public Order build () {
		return new Order();
	}
}
