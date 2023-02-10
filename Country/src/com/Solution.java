package com;


import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) 
	{
		Country C1=new Country("India",1.4);
		Country C2=new Country("China",1.45);
		Country C3=new Country("Russia",0.98);
		Country C4=new Country("USA",0.44);
		TreeSet<Country> TS=new TreeSet<Country>();
		TS.add(C1);
		TS.add(C2);
		TS.add(C3);
		TS.add(C4);
		for(Country C:TS)
		{
			System.out.println(C);
		}
		
		
	}
}
