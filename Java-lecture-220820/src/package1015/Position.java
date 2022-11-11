package package1015;

public class Position {
	// Position 클래스
	//  필드
	//	 x 좌표
	//   y 좌표
	//  생성자
	//	 기본 생성자
	//	 x, y 초기화하는 생성자
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	Position() {
		this(0,0);
	}
	
	Position(int x, int y) {
		setX(x);
		setY(y);
	}
}
