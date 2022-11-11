package package1002;

// 색상을 포함한 좌표(ColorPosition)을 표현하는 클래스
//  필드
//		color	> 설정된 색상이 없으면 "black" 으로 설정
//		x 좌표
//		y 좌표
//  생성자
//		기본 생성자
//		색상만 초기화하는 생성자
//		좌표만 초기화하는 생성자
//		색상과 좌표를 초기화하는 생성자
//  메서드
//		색상과 좌표를 출력하는 메서드


public class Example02_ColorPosition {
	public static void main(String[] args) {
		ColorPosition p1 = new ColorPosition(10, 20);
		p1.print();
		
		ColorPosition p2 = new ColorPosition();
		
	}
}
