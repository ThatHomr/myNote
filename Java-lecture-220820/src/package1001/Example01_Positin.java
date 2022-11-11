package package1001;


// 좌표(Position)를 표현하는 클래스
//  필드
//		- x 좌표
//		- y 좌표
public class Example01_Positin {
	public static void main(String[] args) {
		// 첫 번째 좌표
		// int x = 10;
		// int y = 10;
		
		// 두 번째 좌표
		// int x2 = 20;
		// int y2 = 40;
		
		// 사용자가 첫번째 좌표의 y 값을 50 으로 설정
		//----------------------------------------------------
		Position posA = new Position();
		posA.x = 10;
		posA.y = 10;
		
		Position posB = new Position();
		posB.x = 20;
		posB.y = 50;
		
		
		posA.print();
		posB.print();
		
		double dist = posA.getDistance(posB);
		System.out.println("distance to B = " + dist);
		
		Position posC = new Position();
		posC.x = 60;
		posC.y = -50;
		
		dist = posB.getDistance(posC);
		System.out.println("distance to C = " + dist);
		
	}
}
