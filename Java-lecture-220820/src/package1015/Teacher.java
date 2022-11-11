package package1015;

public class Teacher extends Person{
	private String employeeNumber;
	private String subject;
	
	public Teacher() {
		this(null, 0, null, null);
	}
	public Teacher(String name, int age, String employeeNumber, String subject) {
		super(name, age);
		setEmployeeNumber(employeeNumber);
		setSubject(subject);
	}
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		if(employeeNumber == null || employeeNumber.isEmpty())
			employeeNumber = " - ";
		this.employeeNumber = employeeNumber;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		if(subject == null || subject.isEmpty())
			subject = " - ";
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + String.format(" > %s, %s", employeeNumber, subject);
	}
}







