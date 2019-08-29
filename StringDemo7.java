package exercise29aug19;

public class StringDemo7 {

	public static void main(String[] args) {
		String s="java";
		String s1="Python";
		String s2="java";
		if(s.compareTo(s1)>0)
		{
			System.out.println(s.toString()+" "+s1.toString());
		}
		else
		{
			
		}
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
	}

}
