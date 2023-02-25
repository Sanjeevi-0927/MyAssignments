package javaProgramAssignments;

public class WordLength2 {
	public static void main(String[] args) {
		String Name= "   fly me   to   the moon  ";
		String replaced = Name.replace(" ", ""); 
		
		System.out.println("Total length of the string "+replaced.length());
		String lastWord = replaced.substring(10);
		int length = lastWord.length();
		System.out.println("The last word is "+lastWord+ "  with length " +length);


		
	}
}
