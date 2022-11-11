package package1009;

// Position 클래스를 상속받는
// NamedPosition 클래스를 작성
//  - 필드 (private) 으로 선언
//		이름(name)	: 이름이 없는 경우 "NoName" 으로 설정
//	생성자
//		기본 생성자
//		이름만 초기화하는 생성자
//		이름과 좌표를 초기화하는 생성자
//  - Getter & Setter
//  - 메서드
//		이름과 좌표를 출력하는 메서드


public class Example02_Position {
	public static void main(String[] args) {
		NamedPosition namePoint = new NamedPosition("P1", 10, 30);
		
		namePoint.print();
		
	}
}















