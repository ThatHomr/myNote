package package1015;

public class ColorPosition extends Position {
	// ColorPosition 클래스
	//  필드
	//   color	- 기본 색상 = black
	//  생성자
	//   기본 생성자
	//   x, y 초기화하는 생성자
	//   x, y, color 초기화하는 생성자
	
	private String color;
	
	public void setColor(String color) {
		if(color == null || color.isEmpty())
			color = "black";
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	ColorPosition() {
		this(0, 0, null);
	}
	ColorPosition(int x, int y) {
		this(x, y, null);
	}
	ColorPosition(int x, int y, String color) {
		super(x, y);
		setColor(color);
	}
	
}
