package com.text;

import org.aspectj.lang.JoinPoint;

public class Validity {

	public Validity() {
		
	}
	public void hashpaid(JoinPoint jp) {
		Student target=(Student)jp.getTarget();
		System.out.println("Ckeck fees paid or not");
		System.out.println(jp.getTarget().getClass().getName());
		target.valid=true;
	}
}
