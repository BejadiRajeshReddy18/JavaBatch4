package com.java.oops.access_modifiers_and_static;

public class CountryIndia {//Singelton Pattern - gang of four

	String name;
	String capital;
	boolean isDemocaratic;
	private static CountryIndia india;

	@Override
	public String toString() {
		return "CountryIndia [name=" + name + ", capital=" + capital + ", isDemocaratic=" + isDemocaratic + "]";
	}

	private CountryIndia(String name, String capital, boolean isDemocaratic) {
		super();
		this.name = name;
		this.capital = capital;
		this.isDemocaratic = isDemocaratic;
	}

	static CountryIndia myCountry(String name, String capital, boolean isDemocaratic) {
		if (india == null) {
			india = new CountryIndia(name, capital, isDemocaratic);
		}

		return india;
	}

}
