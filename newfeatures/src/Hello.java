@FunctionalInterface
public interface Hello {
	String sayHello();
	
	 default String sayBye() {
		return "Good Bye!";
	}
	 
	 static void greeting() {
		 System.out.println("Good Day");
	 }

}
