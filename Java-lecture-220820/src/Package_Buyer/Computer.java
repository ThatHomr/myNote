package Package_Buyer;

public class Computer extends Product {
	// 생성자
	//  빈 생성자
	Computer() {
		this(0);
	}
	//  가격을 초기화하는 생성자
	Computer(int price) {
		super(price);
	}
	public String toString() {
		return "Computer";
	}
}
