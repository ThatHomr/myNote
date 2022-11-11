package package1009;

public class NamedPosition extends Position {
	private String name;
	
	public NamedPosition() {
		this(null, 0, 0);
	}
	public NamedPosition(String name) {
		this(name, 0, 0);
	}
	public NamedPosition(String name, int x, int y) {
		super(x, y); // Position(int x, int y) 생성자 호출
		setName(name);
//		setX(x);
//		setY(y);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.isEmpty()) 
			name = "NoName";
		this.name = name;
	}
	
	public void print() {
		System.out.println(name + toString() );
	}
	
	@Override
	public String toString() {	
		// 슈퍼 클래스의 toString 메서드와
		// 서브 클래스의 toString 메서드의 
		// 이름이 같기 때문에 서브 클래스의 toString() 이
		// 재귀 호출이 되어진다.
		
		// return name + toString();
		
		// 슈퍼 클래스의 toString() 을 사용하기 위해서는
		// super 레퍼런스를 통해 접근해야한다.
		return name + super.toString();
	} 
	
}













