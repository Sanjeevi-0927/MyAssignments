package javaProgramAssignments;

public class EmptyPalindrome {
	public static void main(String[] args) {
		String Value="madam ";
		char[] charArray = Value.toCharArray();
		String Rev="";
		for (int i = charArray.length-1; i >=0; i--) {
			Rev=Rev+charArray[i];
		}
			if(Value.equals(Rev)) {
			System.out.println(Value+ " is a palindrome");
		}else {
			System.out.println(Value+ " is not a palindrome");
		}
	}
}
