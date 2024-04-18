package practice3_15_4_2024;
/*Write a Java program to remove duplicate characters from a string using StringBuffer*/
public class DupliChar {
	public static String removeDuplicate(String input)
	{StringBuffer sb=new StringBuffer();
		boolean character[]=new boolean[122];
		for(int i=0;i<input.length();i++)
		{
			char test=input.charAt(i);
			if(!character[test])
			{
				sb.append(test);
				character[test]=true;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
//		boolean character[]=new boolean[122];
//		StringBuffer sb=new StringBuffer();
//		sb.append('s');
//		System.out.println(sb.toString());
String input ="Good Evening";
String neString=removeDuplicate(input);
System.out.println("After removing duplicates :"+neString);
	}

}
