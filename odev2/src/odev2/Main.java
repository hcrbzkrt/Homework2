package odev2;

public class Main {

	public static void main(String[] args) {

		Instructor instructors = new Instructor();
		instructors.setFirstName("Engin");
		instructors.setLastName("Demiroğ");
		instructors.setEmail("xxxx@gmail.com");
		instructors.setId(1);
		instructors.setLessonName("Java");
		instructors.setHomework("odev1");
		
		User users = new User();
		users.setFirstName("Hacer");
		users.setLastName("Bozkurt");
		
		Student students = new Student();
		students.setFirstName("Hacer");
		students.setLastName("Bozkurt");
		students.setHomework("java");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructors); 
		
		System.out.println("      ");
		
		UserManager userManager = new UserManager();
		userManager.add(users);
		userManager.delete(users);
		
		System.out.println("      ");
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(students);
		studentManager.didHomework(students);
		studentManager.rollCall(students);
	}

}
