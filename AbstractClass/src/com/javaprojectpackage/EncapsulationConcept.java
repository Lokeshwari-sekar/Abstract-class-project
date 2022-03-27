package com.javaprojectpackage;

/**
 * Encapsulation:
                 It defined as binding or wrapping of member data 
                 and member function of the class .
             use:
               avoid the data leakage
       condition:
       			if you need to use the member function and member data of the class
       			you must create the object
*
 */
class Calculation
{
	int i=4;
	int j=6;
	void sum()
	{
		int sum=i+j;
		System.out.println("sum :"+sum);
	}
}
/**this is the end of the calculation class 
without object member data and functions are cannot be used
so we encapsulated the data within the class*/

public class EncapsulationConcept {
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		cal.sum();
	}

}
