package test.generics;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ValidationException;

//import test.generics.User;

public class Login implements CheckPassword {

	public static void main(String[] args) {
		User u1 = new User("Adriano", "Gonçalves", 30, "x");
		User u2 = new User("Sara", "Karine", 32, "k");

		List<User> listUser = new ArrayList<User>();
		listUser.add(u1);
		listUser.add(u2);

		for (User uf : listUser) {
			if (validatePasswordTemp(uf)) {
				new ShowUser(uf);
				System.out.println("Validated user");
			} else {
				new ShowUser(uf);
				System.out.println("Invalidated user");
			}
		}
	}

	@Override 
	public boolean validatePassword(User u) {
		String pw = u.getPassword();
		return pw != "x";
	}
	
	public static boolean validatePasswordTemp(User u) {
		String pw = u.getPassword();
		return pw != "x";
	}

}
