package java시험;

class Order {
	private int orderId;
	private String productName;
	private String consumerName;
	private int price;
	private int stock;
	
	public void showOrderInfo() {
		System.out.println("주문번호: " + orderId);
		System.out.println("상품명: " + productName);
		System.out.println("상품명: " + consumerName);
		System.out.println("상품명: " + price);
		System.out.println("상품명: " + stock);
	}
	
	public Order(int id, String Pname, String Cname, int pri, int sto) {
		this.orderId = id;
		this.productName = Pname;
		this.consumerName = Cname;
		this.price = pri;
		this.stock = sto;
	}
	
	public static orderBuilder builder() {
		return new orderBuilder();
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
