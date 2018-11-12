
public class PersonTest {

	
	
	public static void main(String[] args) {
		
		
		
		ObjectContainer oc = new ObjectContainer(); 
		
		Person p1 = new Person("Brauni"); 
		
		oc.store(p1);
		oc.store(new Person("Axel")); 
			
		Person p; 
		p = (Person)oc.get();
		
		System.out.println(p instanceof Person);

		
		
		p1.getName();
		
		
		
		
		
		
		
	}

}