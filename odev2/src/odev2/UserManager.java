package odev2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c� eklendi." );
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c� yorum ekledi." );
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c� silindi.");
	}
}
