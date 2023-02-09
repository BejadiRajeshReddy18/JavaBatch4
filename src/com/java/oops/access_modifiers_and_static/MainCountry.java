package com.java.oops.access_modifiers_and_static;

public class MainCountry {

	public static void main(String[] args) {

//		CountryIndia india = new CountryIndia();
//		india.name = "India";
//		india.isDemocaratic = true;
//		india.capital = "Delhi";
		
//		CountryIndia india2 = new CountryIndia();
		
		
		CountryIndia india = CountryIndia.myCountry("India", "Delhi", true);//Singelton Object
		System.out.println(india);
		System.out.println(india.hashCode());
		
		CountryIndia india2 = CountryIndia.myCountry("Pakistan", "Delhi", true);
		System.out.println(india2);
		System.out.println(india2.hashCode());
	}

}
