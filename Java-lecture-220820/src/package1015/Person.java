package package1015;

public class Person {
	// 해당 클래스에서만 접근이 가능하며
	// 상속 받은 하위 클래스에서도 직접적으로 접근이 불가능
	//  → 하위 클래스에서도 Getter/Setter 를 이용해야한다.
	private String name;
	private int age;
	
	public Person() {
		this(null, 0);
	}
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.isEmpty()) name = "Unknown";
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) age = 0;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// 객체를 표현할 문자열을 생성/반환
		return String.format("Name : %s, Age : %d", name, age);
	}
}



