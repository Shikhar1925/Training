package core.java;

public class ValidateEmail {
		//1.Min 4 chars before@
		//2.Min 3 chars between @ and.
		//3.Min 2 chars after.
		//4.Only 1 occurrence of @ and . is allowed
		//Note: No regular expressions allowed
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "user@gmail.com";
		int iat = email.indexOf('@');
		int idot = email.indexOf('.');
		if(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') && 
				iat >= 4 && (idot - iat)>=3 && (email.length() - idot) >= 2)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
	}

}
