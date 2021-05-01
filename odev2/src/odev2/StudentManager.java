package odev2;

public class StudentManager extends UserManager {

	public void register(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adlý kullanýcý kayýt oldu." );
	}
	
	public void didHomework(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " kullanýcý" + student.getHomework() + " ödevini yaptý.");
	}
	
	public void rollCall(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " kullanýcý yoklamaya katýldý.");
	}
}
