package package1001;

// 사칙 연산을 하기 위한 계산기(Calculator)

public class Example03_Calculator {
	public static void main(String[] args) {
		Calculator call = new Calculator();
		
		int add = call.add(10, 20);
		System.out.println("result : " + add);
		
		int mod = call.mod(10, 0);
		System.out.println("result : " + mod);
	}
}
