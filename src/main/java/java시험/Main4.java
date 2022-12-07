package java시험;

class Order {
	private int orderId;
	private String productName;
	private String consumerName;
	private int price;
	private int stock;
	
	public void showOrderInfo() {
		//System.out.println(order);
	}
	

	public static orderBuilder builder() {
		
		return null;
	}
}

public class Main4 {

	public static void main(String[] args) {
	
		Order order = Order.builder()
				.orderId(100)
				.productName("Samsung GalaxyBook2 Pro")
				.consumerName("홍길동")
				.price(1450000)
				.stock(2)
				.build();
		
		order.showOrderInfo();
	}
}
