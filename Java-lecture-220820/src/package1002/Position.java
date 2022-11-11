package package1002;

public class Position {
	int x;
	int y;
	
	// 기본 생성자
	Position() {
		
	}
	
	// x, y 좌표를 초기화하기 위한 생성자
	Position(int x, int y) {
		// x = x;
		// y = y;
		
		this.x = x;
		this.y = y;
	}
	
	void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
