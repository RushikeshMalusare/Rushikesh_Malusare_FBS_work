package com.text;

public class Student {

	boolean valid;

	public Student(boolean valid) {
		super();
		this.valid = valid;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	
	public void TakeExams() {
		
		if(valid=true) {
			System.out.println("Appearing Exam");
		}
		else {
			System.out.println("Not Appearing");
		}
	}
		
		public void Taketext() {
			System.out.println("Taketext Method");
		}
	
		public void ConductExam() {
			System.out.println("ConductExam Method");
		
	}
	
	
}
