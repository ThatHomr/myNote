package package1001;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	
	double avg() {
		double avg = 0;
		avg = (double)(kor + eng + math) / 3;
		return avg;
	}
	
}
