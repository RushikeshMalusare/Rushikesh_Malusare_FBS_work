package p1;

public class Student {
	int roll;
	String nm;
	double mark;
	String gender;
	
	
	
	public Student() {
		super();
		this.roll = 0;
		this.nm = "null";
		this.mark = 0;
		this.gender ="null";
	}



	public Student(int roll, String nm, float mark, String gender) {
		super();
		this.roll = roll;
		this.nm = nm;
		this.mark = mark;
		this.gender = gender;
	}



	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getNm() {
		return nm;
	}



	public void setNm(String nm) {
		this.nm = nm;
	}



	public double getMark() {
		return mark;
	}



	public void setMark(float mark) {
		this.mark = mark;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	


	
	
	
}
