package odev2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcý eklendi." );
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcý yorum ekledi." );
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcý silindi.");
	}
}
