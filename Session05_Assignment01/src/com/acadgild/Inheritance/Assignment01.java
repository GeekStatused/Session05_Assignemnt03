package com.acadgild.Inheritance;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area inh = new Area();
		System.out.println("This is from super class");
		inh.areaRec();
		System.out.println("*********************");
		System.out.println("This is from sub class");
		
		Calculations inh1 = new Calculations();
		inh1.areaTri();
		inh1.areaRec();
		
	}

}
