package pac;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="id")
	int studId;
	
	@Column(name="name")
	String studName;
	
	@Embedded
	StudAddress studAdd;
	

	public Student() {
		super();
	}
	
	public Student(int studId, String studName, StudAddress studAdd) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAdd = studAdd;
	}

	public int getStudId() {
		return studId;
	}



	public void setStudId(int studId) {
		this.studId = studId;
	}



	public String getStudName() {
		return studName;
	}



	public void setStudName(String studName) {
		this.studName = studName;
	}



	public StudAddress getStudAdd() {
		return studAdd;
	}



	public void setStudAdd(StudAddress studAdd) {
		this.studAdd = studAdd;
	}
	
}


//package com.p1;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
////import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="student")
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)   // auto-increment PK
//    @Column(name="id")
//    private int studId;
//
//    @Column(name="name")
//    private String studName;
//
//    @Column(name="address")
//    private String studAdd;
//
//    public Student() {
//        super();
//    }
//
//    public Student(int studId,String studName, String studAdd) {
//    	this.studId=studId;
//        this.studName = studName;
//        this.studAdd = studAdd;
//    }
//
//    public int getStudId() {
//        return studId;
//    }
//
//    // Correct setter name
//    public void setStudId(int studId) {
//        this.studId = studId;
//    }
//
//    public String getStudName() {
//        return studName;
//    }
//
//    public void setStudName(String studName) {
//        this.studName = studName;
//    }
//
//    public String getStudAdd() {
//        return studAdd;
//    }
//
//    public void setStudAdd(String studAdd) {
//        this.studAdd = studAdd;
//    }
//}

