package package1022;

import java.util.Scanner;

public abstract class Convert {
	public abstract String getSrcString();
	public abstract String getDestString();
	public abstract double convert(double src);	// 변환
	
	
	private double ratio;	// 비율
	
	public Convert(double ratio) {
		setRatio(ratio);
	}
	
	public double getRatio() {
		return ratio;
	}
	
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	
	// 변환기의 실행
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println(getSrcString() + "을 " + getDestString() + "(으)로 바꿉니다.");
		// → 추상 메서드는 해당 클래스에서 구현되지 않고
		//	 하위 클래스에서 오버라이딩을 통해 구현
		// → 해당 클래스에서 호출하면 오버라이딩된 메서드를
		//	 동적 바인딩을 통해 호출한다.
		
		System.out.println(getSrcString() + "을 입력하세요 >>> ");
		double src = input.nextDouble();
		
		double dest = convert(src);
		
		System.out.printf("변환 결과는 : %.2f%s입니다.", dest, getDestString());
		// System.out.println("변환 결과 : " + dest + getDestString() + "입니다.");
		
		input.close();
	}
	
}
