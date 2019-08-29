package exercise29aug19;

public class StringToString {
	private int regno;
	private String name;
	public StringToString() {
		super();
	}
	public StringToString(int regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
	}
	public String toString()
	{
		return "Name "+name+" Regno "+regno+"\n";
	}
	public static void main(String[] args) {
		StringToString sc=new StringToString(123,"Dhivya");
		StringToString sc1=new StringToString(122,"Dhivya");
		System.out.println(sc+" "+sc1);
	}
}
