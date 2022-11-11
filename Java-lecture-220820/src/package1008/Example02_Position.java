package package1008;

class Position {
	private int x;
	private int y;
	
	
	public Position() {
		this(0, 0);
	}
	public Position(int x, int y) {
		// super(); // = 상위 클래스의 생성자
		setX(x);
		setY(y);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}



public class Example02_Position {
	public static void main(String[] args) {
		
		
		
	}
}
