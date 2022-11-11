package package1009;


// 좌표의 범위를 최소 -100, 최대 100 까지를 다룬다.
public class Position {
	private int x;
	private int y;
	
	// 최대, 최소 좌표 값
	//  - 모든 인스턴스가 동일한 값을 항상 유지하기 때문에
	//    각 인스턴스마다 만들어줄 필요 없이
	//	  클래스에 하나만 만들어도 된다.
	final static int MAX_X = 100;
	final static int MIN_X = -100;
	final static int MAX_Y = 100;
	final static int MIN_Y = -100;
	
	public Position() {
		this(0, 0);
	}
	public Position(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
}







