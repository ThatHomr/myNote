package package1001;

public class File03_Reference {
	
	// 값에 의한 전달(Call by value)
	static void pluseData(int a) {
		a += 100;
		System.out.println("pluseData = " + a);
	}
	
	// 참조에 의한 호출(Call by reference)
	//  메모리의 주소가 전달되어 오며, 이때 호출된 곳의 객체에
	//  영향을 줄 수 있다.
	static void pluseSimpleData(Simple s) {
		s.data += 100;
		System.out.println("pluseSimpleData = " + s.data);
	}
	
	public static void main(String[] args) {
		// 참조(Reference)
		//  - 무언가를 가리킨다.
		//  - 특정 데이터 또는 영역을 가리킨다.
		
		// 참조 변수
		//  - 무언가를 가리키는 변수
		//  → 메모리의 주소를 가지고 특정 데이터의 영역을 가리킨다.
		
		Simple s1 = new Simple();
		System.out.println("s1 = " + s1);
		
		//--------------------------------------------------------------
		int a = 10;
		// 변수 a 의 값을 변수 b 에 복사
		int b = a; 
		// int b = 10;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		a = 50;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("----------------------------------");
		// 참조 변수 s1 의 값을 참조 변수 s2 에 복사
		//  참조 변수 s1 의 값 = 메모리의 주소
		Simple s2 = s1;	// 같은 메모리 주소를 공유
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		s1.name = "Data A";
		s1.data = 2000;
		
		s2.print();
		System.out.println("----------------------------------");
		a = 10;
		System.out.println("a = " + a);
		pluseData(a);
		// pluseData(10); → 변수 a 에 저장된 값을 복사하여 전달
		System.out.println("a = " + a);
		System.out.println("----------------------------------");
		Simple s3 = new Simple();
		s3.name = "Data 3";
		s3.data = 10;
		s3.print();
		
		pluseSimpleData(s3);
		// → 참조변수 s3 에 저장된 메모리 주소가 전달
		
		s3.print();
		System.out.println("----------------------------------");
		pluseData(s3.data);
		// s3 의 data 에 저장된 '값'을 전달
		// 따라서 s3 객체에는 아무런 영향이 없다.
		s3.print();
	}
}
