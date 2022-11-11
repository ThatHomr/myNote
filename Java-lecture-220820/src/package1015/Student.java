package package1015;

// Person 클래스를 상속
public class Student extends Person{
	private String studentNumber;
	private int schoolYear;
	private double grade;
	
	public Student() {
		this(null, 0, null, 0, 0);
	}
	
	public Student(String name, int age, String studentNumber, int schoolYear, double grade) {
		// name 과 age 는 Person 클래스에 선언된 필드이기 때문에
		// Person 클래스의 생성자로 초기화가 되어지도록 해야한다.
		super(name, age);
		setStudentNumber(studentNumber);
		setSchoolYear(schoolYear);
		setGrade(grade);
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		if(studentNumber == null || studentNumber.isEmpty())
			studentNumber = " - ";
		this.studentNumber = studentNumber;
	}
	public int getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		if(schoolYear < 0) schoolYear = 0;
		this.schoolYear = schoolYear;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		if(grade < 0) grade = 0;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		// 상위 클래스에 동일한 이름의 메서드가 있으면
		// 우선 순위는 하위 클래스에 있는 메서드가 높기 때문에
		// 상위 클래스의 메서드를 호출하려면 
		// super 레퍼런스를 통해 호출해야한다.
		return super.toString() + "\n" + String.format(" > %s, %d학년, %.2f점", studentNumber, schoolYear, grade);
	}
}
















