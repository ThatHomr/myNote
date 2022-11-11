package package1015;

// Position 클래스
//  필드
//	 x 좌표
//   y 좌표
//  생성자
//	 기본 생성자
//	 x, y 초기화하는 생성자

// ColorPosition 클래스
//  필드
//   color	- 기본 색상 = black
//  생성자
//   기본 생성자
//   x, y 초기화하는 생성자
//   x, y, color 초기화하는 생성자

// NamedPosition 클래스
//  필드
//   name	- 기본 이름 = NoName
//  생성자
//   기본생성자
//	 x, y 초기화하는 생성자
//	 x, y, name 초기화하는 생성자


public class Example02_Position {
	
	// 두 좌표의 중앙에 위치한 좌표(Position)를 생성하는 메서드를 작성
	//  + 반환되는 인스턴스의 타입은 첫번째 매개변수에 맞춰 객체를 생성
	static Position setMidPosition(Position p1, Position p2) {
		int x = (p1.getX() - p2.getX()) / 2;
		int y = (p1.getY() - p2.getY()) / 2;
		
		
		if(p1 instanceof ColorPosition) {
			// 업 캐스팅되어 반환된다.
			return new ColorPosition(x, y);
		}
		else if(p1 instanceof NamedPosition) {
			return new NamedPosition(x, y);
		}
		
		return new Position(x, y);
	}
	
	
	public static void main(String[] args) {
		NamedPosition np1 = new NamedPosition(10, 5, "P1");
		Position p1 = new Position(5, 10);
		
		NamedPosition mid = (NamedPosition)setMidPosition(np1, p1);
		System.out.println("MID = " + String.format("(%d, %d)", mid.getX(), mid.getY()));
	}

}
