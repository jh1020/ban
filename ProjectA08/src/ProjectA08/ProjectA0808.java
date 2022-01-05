package ProjectA08;

class Order{
	public String orderNum;
	public String customerId;
	public String orderDate;
	public String customerName;
	public String productNum;
	public String shippingAddress;

	public void orderInfo() {
		System.out.println("주문번호 : " + orderNum);
		System.out.println("주문자 아이디: "+ customerId);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문자 이름: " + customerName);
		System.out.println("주문 상품 번호: " + productNum);
		System.out.println("배송 주소: " + shippingAddress);
	}

}

public class ProjectA0808 {
	
	public static void main(String[] args) {
		Order order0001 = new Order() ;
		
		order0001.orderNum = "201907210001";
		order0001.customerId = "abc123";
		order0001.orderDate = "2019년 7월 21일";
		order0001.customerName = "홍길순";
		order0001.productNum = "PD-345-12";
		order0001.shippingAddress = "서울시 영등포구 여의도동 20번지";
		
		order0001.orderInfo();
		
		
		
		
	}

}
