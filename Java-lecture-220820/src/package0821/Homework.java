package package0821;

public class Homework {
	public static void main(String[] args) {
		
		// 현재 보유하고 있는 돈이 50000원일 때
		int money = 50000;
		// 개당 3000원인 사과를 5개를 사고
		int apple = 3000;
		int app_piece = 5;
		// 개당 12000원인 가방을 1개 샀을 때
		int bag = 12000;
		int bag_piece = 1;
		
		int buy1 = (apple * app_piece)+(bag * bag_piece);
		// 구매 금액과 남은 돈을 출력하는 프로그램을 작성
		// 보유한 돈, 구매 물품들의 가격, 구매 개수
		System.out.println("보유한 돈       : " + money + "원");
		System.out.println("구매 물품들의 가격");
		System.out.println("사과의 가격     : " + apple + "원");
		System.out.println("사과의 총가격   : " + (apple * app_piece) + "원");
		System.out.println("사과의 구매개수 : " + app_piece + "개");
		System.out.println("가방의 가격     : " + bag + "원");
		System.out.println("가방의 총가격   : " + (bag * bag_piece) + "원");
		System.out.println("가방의 구매개수 : " + bag_piece + "개");
		// 총 구매 금액, 남은 돈을 모두 출력
		System.out.println("구매 금액       : " + buy1 + "원");
		System.out.println("남은 금액       : " + (money - buy1) + "원");
	}
}
