package package1002;

/*
 * 	학생을 표현하는 클래스
 * 		필드
 * 			이름		: 이름이 없는 경우 " Unknown" 으로 설정
 * 			국어 점수	: 0 ~ 100 사이의 값이 아닌 경우 0
 * 			영어 점수	: 0 ~ 100 사이의 값이 아닌 경우 0
 * 			수학 점수	: 0 ~ 100 사이의 값이 아닌 경우 0
 * 			평균		: 0 ~ 100 사이의 값이 아닌 경우 0
 * 		생성자
 * 			기본 생성자
 *			이름만 초기화하는 생성자
 *			모든 필드를 초기화하는 생성자
 *		메서드
 *			학생의 모든 정보를 출력하는 메서드
 * */

class Student {
	
	Student() {
		this(null, 0, 0, 0);
	}
	Student(String name) {
		this(name, 0, 0, 0);
	}
	Student(int kor, int eng, int math) {
		this(null, kor, eng, math);
	}
	
	// 모든 필드를 초기화하는 생성자
	//  반드시 모든 필드를 매개변수로 받을 필요는 없다.
	//	 평균 = 3개의 점수에 의해 결정되는 값
	//  매개변수로 평균을 받게 되는 경우
	//	 - 실제 3개의 점수에 의해 연산된 평균과
	//	   매개변수에 전달된 평균이 다를 수 있다.
	//	 - 객체를 생성하기 전 매번 평균을 구하는 코드를 작성해야한다.
	//	→ 특정 필드가 다른 필드에 의해 값이 결정되는 경우에는
	//    외부에서 값을 받아올 필요가 없고, 생성자 내에서 값을 설정
	Student(String name, int kor, int eng, int math) {
		
		if (name == null || name.isEmpty()) name = "UnKnown";
		if (!isValidation(kor)) kor = 0; 
		if (!isValidation(eng)) eng = 0; 
		if (!isValidation(math)) math = 0; 
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (double)(this.kor + this.eng + this.math) / 3;
		// 현재 필드의 값을 통해 평균을 구한다.
	}
	
	// 점수의 유효성을 검사하기 위한 메서드
	boolean isValidation(int score) {
		return score >= 0 && score <= 100;
	}
	
	String name;
	int kor;
	int eng;
	int math;
	double avg;
	
	void print() {
		System.out.println("Name     : " + name);
		System.out.println("korean   : " + kor);
		System.out.println("English  : " + eng);
		System.out.println("Math     : " + math);
		System.out.println("Average  : " + avg);
	}
	
}

public class Example03_Student {
	public static void main(String[] args) {
		Student std1 = new Student("홍길동", 100, 90, 153);
		std1.print();
	}

}
