package org.cts.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class C {
	public static void main(String[] args) {
		Set<B> se=new LinkedHashSet();
		B e=new B();
		e.setEmpAdd("No 3,Mable shade,poonamalle");
		e.setEmpDob(21192);
		e.setEmpGender("Female");
		e.setEmpSal(25.5);
		
		B d=new B();
		d.setEmpAdd("Chennai 600056");
		d.setEmpDob(98756);
		d.setEmpGender("Male");
		d.setEmpSal(50.7);
		
		
		se.add(e);
		se.add(d);
		se.add(e);
		
		for(B x:se) {
			System.out.println(x.getEmpAdd());
			System.out.println(x.getEmpDob());
			System.out.println(x.getEmpGender());
			System.out.println(x.getEmpSal());
		}
	}
}