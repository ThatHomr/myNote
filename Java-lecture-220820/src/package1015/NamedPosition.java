package package1015;

public class NamedPosition extends Position {
	// NamedPosition 클래스
	//  필드
	//   name	- 기본 이름 = NoName
	//  생성자
	//   기본생성자
	//	 x, y 초기화하는 생성자
	//	 x, y, name 초기화하는 생성자

	private String name;
	
	public void setName(String name) {
		if(name == null || name.isEmpty())
			name = "NoName";
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	NamedPosition() {
		this(0, 0, null);
	}
	NamedPosition(int x, int y) {
		this(x, y, null);
	}
	NamedPosition(int x, int y, String name) {
		super(x, y);
		setName(name);
	}
	
}
