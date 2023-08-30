package core.java;

public class EmailValidator {
	//1.Min 4 chars before@
	//2.Min 3 chars between @ and.
	//3.Min 2 chars after.
	//4.Only 1 occurrence of @ and . is allowed
	//Note: No regular expressions allowed
		   public static void main(String[] args) {
		      String RegEmail = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		      String email1 = "users@gmail.com";
		      Boolean b = email1.matches(RegEmail);
		      if(b==true){
		       		System.out.println("valid email");	
			}else{
				System.out.println("Invalid Email");
			}
		   }
	}
