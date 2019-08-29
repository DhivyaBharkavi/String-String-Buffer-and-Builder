package exercise29aug19;

public class StringJoinLengthIsEmpty {

	public static void main(String[] args) {
		StringJoinLengthIsEmpty n=new StringJoinLengthIsEmpty();	
		String s = new String();
		System.out.println("Given String "+s.isEmpty());
		s="Java Programming";
		s=s.join("-", "welcome","to","java");
		System.out.println("Join a words : "+s);
		System.out.println("The length is "+s.length());
		System.out.println("Given String "+s.isEmpty());
	}

}
