package odev2;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()+ " " +  instructor.getLessonName() + " dersini yayýnladý.");
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()+ " " + instructor.getHomework() + " sisteme yükledi.");
	}
	
}
