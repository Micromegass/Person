
public class Person {
	private String name;


	
	
	Person(String name) {
		this.name = name;
	}
	
	
	//overloading constructor
	Person() {
		
		
	}
	
	
	
	String getFirstName() {
	    return name;
	}
	
	
	void getName() {
		
		System.out.print(name); 
		
	}	

}


