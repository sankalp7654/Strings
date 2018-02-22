
public class StringDemo {

	public static void main(String[] args) {
		
		// Creates a String inside StringPool
		String s1 = "Sankalp Saxena";
	
		// Since String is already present inside StringPool
		// s2 will refer to that String only 
		// "STRING IS IMMUTABLE"
		String s2 = "Sankalp Saxena";
		
		// Both String object has same hash code 
		// Since, they are pointing to same String inside the StringPool
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		// Compare the references of both the objects
		System.out.println(s1 == s2);
		
		// Compare the contents of both the objects
		System.out.println(s1.equals(s2));
		
		// Playing with StringBuilder Class
		StringBuilder string = new StringBuilder();
		string.insert(0, "This is an Awesome Developer");
		string.append("His name is Sankalp Saxena");
		System.out.println(string.length());
		System.out.println(string);
		
		// Playing with StringBuffer Class
		StringBuffer s = new StringBuffer();
		s.insert(0, "Java is my bae");
		System.out.println(s);
	}

}
