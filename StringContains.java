package exercise29aug19;

import java.util.Scanner;
public class StringContains {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s = new String();
		System.out.println("Enter a sentences");
		s=scan.nextLine();
		System.out.println("Find a sentences");
		String find=scan.nextLine();
		System.out.println(s.contains(find));
	}

}
