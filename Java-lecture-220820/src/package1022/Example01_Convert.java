package package1022;


// 단위 변환하기 위한 클래스(Convert)
//  - 어떤 단위를 변환할지 정하진 않았기 때문에
//	  추상 클래스로 정의

class WonToDollar extends Convert {

	public WonToDollar(double ratio) {
		super(ratio);
	}

	@Override
	public String getSrcString() {

		return "Won";
	}

	@Override
	public String getDestString() {

		return "$";
	}

	@Override
	public double convert(double src) {

		return src / getRatio();
	}
	
}

// km → mile 로 변환하기 위한 변환기를 작성
class KmToMile extends Convert {

	public KmToMile(double ratio) {
		super(ratio);
	}

	@Override
	public String getSrcString() {
		return "Km";
	}

	@Override
	public String getDestString() {

		return "mile";
	}

	@Override
	public double convert(double src) {

		return src / getRatio();
	}
	
}

public class Example01_Convert {
	public static void convert(Convert con) {
		con.run();
	}
	
	public static void main(String[] args) {
		// 원을 달러로 변환
		WonToDollar convert1 = new WonToDollar(1400);
		// convert1.run();
		
		// 1km = 1.6 mile;
		convert(new KmToMile(1.6));

	}
	
}
