
public class HelloDemo {
	public static void main(String[] args) {
		Hello h1 = ()->"Hello World";
		System.out.println(h1.sayHello());
		
		Hello h2 = ()-> {
			String msg = "Bonjour le Monde";
			return msg;
		};
		System.out.println(h2.sayHello());
		
		System.out.println(h1.sayBye());

		Hello.greeting();
	}

}
