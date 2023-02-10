package com;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) 
	{
		Country C1=new Country("India",1.4);
		Country C2=new Country("China",1.45);
		Country C3=new Country("Russia",0.98);
		Country C4=new Country("USA",0.44);
		ArrayList<Country> AL=new ArrayList<Country>();
		AL.add(C1);
		AL.add(C2);
		AL.add(C3);
		AL.add(C4);
		for(Country C:AL)
		{
			System.out.println(C);
		}
		
		
	}

}
