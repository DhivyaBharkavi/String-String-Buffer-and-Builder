package exercise29aug19;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1="Java is a very good language";  
		String replaceString=s1.replace('v','w');
		System.out.println(replaceString);
		String replaceString1=s1.replace("Java", "Python");
		System.out.println(replaceString1);  
		String c="Bag";
		StringBuffer d=new StringBuffer();
		
		c.concat(s1);
		System.out.println(d);
		System.out.println(c.concat(s1));
	}

}
