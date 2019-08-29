package exercise29aug19;

public class StringDemo9 {	
	public static void main(String[] args) {
		String s1="Redington Smart Learning Center, I learn Java here. It is also learn in core java.";  
		String[] sentence=s1.split(",");
		String[] words=s1.split(" ");
		System.out.println("Sentences");
		System.out.println("~~~~~~~~~");
		if(sentence!=null)
		{
			for(String s:sentence)
			{  
				System.out.println(s);  
			}
			System.out.println("No of sentences "+sentence.length);
		}	
		System.out.println();
		System.out.println("Words");
		System.out.println("~~~~~");
		if(words!=null)
		{
			for(String ss:words)
			{  
			System.out.println(ss);  
			}
			System.out.println("No of words "+words.length);
		}
		System.out.println();
		for(String w:s1.split(" ", 3))
		{
			System.out.println(w);
		}
		
		
}}
