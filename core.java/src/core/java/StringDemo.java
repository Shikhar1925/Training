package core.java;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello"; 				//Primitive Style -->created in STRINGPOOL
		String s2 = new String("Hello");	//Object style -->Created in HEAP Memory
		String s3 = "Hello";				//Primitive Style--->Created in STRINGPOOL
		
		System.out.println(s1);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println();
		//Comparing string values
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		// Performing String Operations
		s1 = s1+" World";
		System.out.println(s1);
		System.out.println(s1==s3);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
		System.out.println(s1.replace('o', 'e'));
		System.out.println(s1);
		
		String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";		//Using split method
		String[] days = week.split("-");
		for(String day: days) {
			System.out.println(day);
		}
		// Converting string into integers
		String num1 = "10";
		String num2 = "20";
		System.out.println(num1+num2);
		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
	}

}
