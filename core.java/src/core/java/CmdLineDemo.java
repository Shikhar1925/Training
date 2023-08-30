package core.java;

public class CmdLineDemo {

	public static void main(String[] args) {
		int sum=0;
		for(String a : args) {
			//System.out.println(a);
			
		}
		int total = 0;
		int ex = 5;
		Integer xo = ex; // Boxing
		int z = xo; //Unboxing
		System.out.println(ex+xo*z);
		//Java takes care of boxing and unboxing hence called Auto-boxing
	}

}
