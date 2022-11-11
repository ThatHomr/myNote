package package1008;

public class Student {
	
	// 생성자
	Student () {
		this(null, 0, 0, 0);
	}
	Student(String name) {
		this(name, 0, 0, 0);
	}
	Student(String name, int kor) {
		this(name, kor, 0, 0);
	}
	Student(String name, int kor, int eng) {
		this(name, kor, eng, 0);
	}
	Student(String name, int kor, int eng, int math) {
		setName(name);
		setKorean(kor);
		setEnglish(eng);
		setMath(math);
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	// setter
	public Student setName(String name) {
		if (name == null || name.isEmpty())
			name = "UnKnown";
		this.name = name;
		
		return this;
	}
	public Student setKorean(int kor) {
		isValidation(kor);
		this.kor = kor;
		setAverage();
		return this;
	}
	public Student setEnglish(int eng) {
		isValidation(eng);
		this.eng = eng;
		setAverage();
		return this;
	}
	public Student setMath(int math) {
		isValidation(math);
		this.math = math;
		setAverage();
		return this;
	}
	
	// 해당 클래스에 내에서만 사용할
	// 점수의 유효성을 검사하기 위한 메서드
	private boolean isValidation(int score) {
		return score >= 0 && score <= 100;
	}
		
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	
	// 평균은 해당 객체의 필드를 통해 연산된 값
	// 따라서 외부에서 받아올 필요가 없다.
	private void setAverage() {
		avg = (double)(kor + eng + math) / 3;
	}
	
	void print() {
		System.out.printf("%s : %.2f\n", name, avg);
	}
	
}
