package javaProgramAssignments;

public class WordLength3 {

	public static void main(String[] args) {
		String Name = "luffy is still joyboy";
	String[] split = Name.split(" ", 4);	

	for (int i = 3; i < split.length; i++) {
		String lastWord = split[i];
		int length = lastWord.length();
		System.out.println("The last word is "+lastWord+ "  with length "+ length);
			
	}
}
}
