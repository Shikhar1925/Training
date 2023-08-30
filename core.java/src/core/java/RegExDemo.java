package core.java;

public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shikhar";
		String mobile = "7666357924";
		String email = "shikhar.bhasin@in.ey.com";
		
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		String mobileRegex = "[6-9]{1}[0-9]{9}";
		String emailRegex = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		
		System.out.println(name.matches(nameRegex)?"Valid name":"Invalid name");
		System.out.println(mobile.matches(mobileRegex)?"Valid Mobile":"Invalid Mobile");
		System.out.println(email.matches(emailRegex)?"Valid email":"Invalid email");
		

	}

}
