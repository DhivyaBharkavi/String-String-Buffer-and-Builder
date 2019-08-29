package exercise29aug19;

public class Index {

	public static void main(String[] args) {
		String s = new String("Java is a Object oriented programming");
		System.out.println(s.indexOf("is"));
		System.out.println(s.indexOf('j', 4));
		System.out.println(s.indexOf('j', 16));
		System.out.println(s.indexOf("Object"));
		System.out.println(s.indexOf("Object", 8));
		System.out.println(s.indexOf("Object", 18));
	}

}
