package com;

public class Country implements Comparable<Country>
{
	
	String name;
	Double population;
	public Country(String name,double population)
	{
		this.name=name;
		this.population=population;
	}
	@Override
	public String toString()
	{
		return "County name : "+name+" Population :"+population;
		}
	@Override
	public int compareTo(Country o)
	{
		// TODO Auto-generated method stub
		return o.population.compareTo(this.population);
	}
	

}
