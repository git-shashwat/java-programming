class Human {
	Human() {
		System.out.println("Human class constructor");
	}
}

class Person extends Human { 
	String name = "Mukesh";
	Person(String x) 
	{ 	
		name = x;
		System.out.println("Person class Constructor"); 
	} 
} 

class Student extends Person { 
	String name = "Anil";
	Student() 
	{ 
		super("Suresh"); 

		System.out.println("Student class Constructor"); 
	} 
	void display() {
		System.out.println("Name: " + super.name);
	}
} 

class Test { 
	public static void main(String[] args) 
	{ 
		Student s = new Student(); 
		s.display();
	} 
} 

