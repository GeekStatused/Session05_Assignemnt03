package com.acadgild.Inheritance;

public class Calculations extends Area{
	
	double base = 5;
	double height = 5;
	
	

public void areaTri(){
	double aLength = 10;
	double aWidth = 20;
	double area;
	
	area = base *  height / 2;
	System.out.println(area);
	
}
public void areaRec(){
	double aLength = 15;
	double aWidth = 21;
	double area;
		area = aLength * aWidth;
		System.out.println(area);
		
	}

}
