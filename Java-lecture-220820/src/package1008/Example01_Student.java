package package1008;

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




public class Example01_Student {
	public static void main(String[] args) {
		Student std1 = new Student("홍길동");
		std1.print();
		
		std1.setKorean(89);
		std1.setEnglish(80);
		std1.setMath(71);
		std1.print();
		
		Student std2 = new Student();
		std2.print();
		std2.setName("김철수")	// 이름 설정
			.setKorean(99)		// 국어 점수
			.setEnglish(82)		// 영어 점수
			.setMath(100)		// 출력
			.print();
		
		std2.setMath(87).print();
	}
}
