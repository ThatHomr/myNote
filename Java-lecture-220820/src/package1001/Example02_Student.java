package package1001;

// 학생(Student)을 표현하기 위한 클래스
//  학생의 정보 = 필드
//		- 이름
//		- 국어 점수
//		- 영어 점수
//		- 수학 점수

public class Example02_Student {
	public static void main(String[] args) {
		// Student 클래스를 작성 한 다음
		// Student 객체를 생성하여 아래와 같이 데이터를 저장
		//  이름 = 홍길동
		//  국어 점수 = 85점
		//  영어 점수 = 70점
		//  수학 점수 = 91점
		
		Student std = new Student();
		
		std.name = "홍길동";
		std.kor = 85;
		std.eng = 70;
		std.math = 91;
		
		
		// 객체를 생성한 다음 학생의 평균을 출력하는 프로그램을 작성
		System.out.println(std.name + "의 평균 : " + std.avg());
	}
}
