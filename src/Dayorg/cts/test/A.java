package Dayorg.cts.test;

import java.util.ArrayList;
import java.util.List;

import org.cts.test.Employee;

public class A {
	public static void main(String[] args) {
		List<GandT> s=new ArrayList<>();
		
		GandT e=new GandT();
		e.setEmpId(24676);
		e.setEmpName("abi");
		e.setMobNo(4567894567l);
		
		GandT e1=new GandT();
		e1.setEmpId(567);
		e1.setEmpName("Ela");
		e1.setMobNo(987634576l);
		
		s.add(e);
		s.add(e1);
		s.add(e);
		
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i).getEmpId());
			System.out.println(s.get(i).getEmpName());
			System.out.println(s.get(i).getMobNo());
		}
		
	}

}
