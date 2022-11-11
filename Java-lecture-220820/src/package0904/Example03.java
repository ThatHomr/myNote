package package0904;

public class Example03 {
	public static void main(String[] args) {
		
		// do-while 문을 이용하여
		// 구구단 중 6단을 출력하는 프로그램을 작성
		
		int num = 6;
		int count = 0;
		
		do {
			System.out.println(num + " * " + (count + 1) + " = " + (num * (count + 1)));
			count++;
		} while (count < 9);
		
		
	}
}
