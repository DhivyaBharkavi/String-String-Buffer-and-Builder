package exercise29aug19;

public class StringDemo1 {

	public static void main(String[] args) {
		String s="PYTHON";
		String s1="python";
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Not equal");
		}
	}

}
