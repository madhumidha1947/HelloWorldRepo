
public class Student {
	
	int studentID;
	String studentName;
	
	public static void main(String[] args) {
		
		System.out.println("I am inside Main method");
		
		// Creating an object of Student Class and this will also call the default constructor
		Student defaultStud = new Student();
		System.out.println("Calling defaultStud ID: " + defaultStud.studentID);
		System.out.println("Calling defaultStud Name: " + defaultStud.studentName);

		// If I dont want to use a constructor to set the states, THis is what I will do
		defaultStud.studentID = 3;
		defaultStud.studentName = "Shashwath";
		System.out.println("Calling defaultStud ID: " + defaultStud.studentID);
		System.out.println("Calling defaultStud Name: " + defaultStud.studentName);

		// Creating an object of Student Class and also setting the states or parameters for this object
		Student stud1 = new Student(1, "Devaraj");
		System.out.println("Calling stud1's ID: " + stud1.studentID);

		Student stud2 = new Student(2, "Madhu");
		System.out.println("Calling stud2's ID: " + stud2.studentID);
	}
	
	// Default Constructor
	public Student() {
		System.out.println("I am inside default constructor.");
	}
	
	// Constructor initializing the arguments or states
	public Student(int studID, String studName) {
		
		System.out.println("I am inside overloaded constructor.");

		// I am setting the argument for this Student Object
		studentID = studID;
		studentName = studName;	
	}

}
