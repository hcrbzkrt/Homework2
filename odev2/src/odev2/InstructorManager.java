package odev2;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()+ " " +  instructor.getLessonName() + " dersini yay�nlad�.");
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()+ " " + instructor.getHomework() + " sisteme y�kledi.");
	}
	
}
