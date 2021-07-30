package sub1;

public class Apple {

	private String country;
	private int price;
	
	public Apple() {
		this.country = "대한민국";
		this.price = 2000;
	}
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		System.out.println("사과 원산지 : "+country);
		System.out.println("사과 가격 : "+price);
		return super.toString();
	}
}
