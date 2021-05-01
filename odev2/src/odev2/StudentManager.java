package odev2;

public class StudentManager extends UserManager {

	public void register(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adl� kullan�c� kay�t oldu." );
	}
	
	public void didHomework(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " kullan�c�" + student.getHomework() + " �devini yapt�.");
	}
	
	public void rollCall(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " kullan�c� yoklamaya kat�ld�.");
	}
}
