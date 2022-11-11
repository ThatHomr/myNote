package package1001;

// 좌표를 표현하기 위한 클래스
public class Position {
	int x;	// x 좌표
	int y;	// y 좌표
	
	void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	// 다른 좌표와의 거리를 구하기 위한 메서드(기능)
	double getDistance(Position dest) {
		int distX = x - dest.x;
		int distY = y - dest.y;
		
		double dist = Math.sqrt( Math.pow(distX, 2) + Math.pow(distY, 2) );
		
		return dist;
	}
}
