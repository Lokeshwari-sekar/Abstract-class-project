package com.staticandnonstatic;
//abstract class
abstract class Area 
{
	//abstract method
	abstract void calArea();
	//normal method
	Area()
	{
		System.out.println("Abstract class can have constructor");
	}
	void displ()
	{
		System.out.println("Method with the body");
	}
}
//inheritance
class Reactangle extends Area{

	//abstract class method implementation
	@Override
	void calArea() {
		int l=3;
		int b=4;
		int area=l*b;
		System.out.println("area of reactangle="+area);
		
	}
	
}

public class AbstractionProgram {
public static void main(String[] args) {
		
		//Area ob=new Area();//abstract class cannot be instantiated
				Reactangle ob=new Reactangle();
				ob.calArea();


	}

}
