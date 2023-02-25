package javaProgramAssignments;

public class PalindronAssignment2 {

	public static void main(String[] args) {
		String val = "race a car";
		String Reverse= "";
		String replaced = val.replace(" ", "");
		char[] charArray = replaced.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			Reverse= Reverse+charArray[i];
			
		}
		if(val.equals(Reverse)) {
			System.out.println(Reverse+ " is a palindrome");
		}else {
			System.out.println(Reverse+ " is not a palindrome");
		}
	}

}
