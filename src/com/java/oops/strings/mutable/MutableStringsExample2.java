package com.java.oops.strings.mutable;

public class MutableStringsExample2 {

	public static void main(String[] args) {

		// String buffer is very similar to StringBuilder
		StringBuffer sbl = new StringBuffer("Sparrow");// thread safe
//		sbl += "golden";
		sbl.append(" is a beautiful bird.");

		System.out.println(sbl);
		sbl.reverse();
		System.out.println(sbl);
		String substring = sbl.substring(0, 4);// 0 - 3
		System.out.println(substring);
		System.out.println(sbl);

		// While Multi Threading, go for String Buffer becuase it is thread safe
	}

}
