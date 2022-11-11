package package1002;

// 좌표(Position)를 표현할 클래스를 작성
//  - 필드
//		x 좌표
//		y 좌표
//  - 생성자
//		기본 생성자
//		x, y 좌표를 초기화하는 생성자
//  - 메서드
//		좌표를 출력하는 메서드


public class Example01_Position {
	public static void main(String[] args) {
		Position p1 = new Position();  // 기본 생성자
		p1.x = 10;
		p1.y = 40;
		p1.print();
		
		Position p2 = new Position(50, 40); // 좌표를 초기화하는 생성자
		p2.print();
	}
}
