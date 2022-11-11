package package1002;

public class ColorPosition {
	String color;	// 색상
	int x;			// x 좌표
	int y;			// y 좌표
	
	// 생성자
	ColorPosition() {
		this(null, 0, 0);
	}
	ColorPosition(String color) {
		this(color, 0, 0);
	}
	ColorPosition(int x, int y) {
		this(null, x, y);
	}
	ColorPosition(String color, int x, int y) {
		
		// 필드의 초기화가 실제로 이뤄지는 생성자
		// 따라서 필드에 초기화하기 위한 유효성 검사는
		// 해당 생성자에서만 구현해도 된다.
		
		// 문자열 유효성 검사
		//  1. null 검사
		//  2. isEmpty() 메서드 = 빈 문자열인지 검사
		if (color == null || color.isEmpty())
			color = "black";
		
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	void print() {
		System.out.println(color + "(" + x + ", " + y + ")");
	}
	
}
