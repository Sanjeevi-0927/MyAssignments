package javaProgramAssignments;



public class PalindromAssignment3 {
public static void main(String[] args) {
	String val="A man, a plan, a canal: Panama";
	String Reversename="";
	String convertLowerCase = val.toLowerCase();
	String combineSpace = convertLowerCase.replace(" ", "");
	String replacedSymbols = combineSpace.replaceAll("\\W", "");
	
	char[] charArray = replacedSymbols.toCharArray();
		
	for (int i = charArray.length-1; i >=0; i--) {
		Reversename=Reversename+charArray[i];
	}
	
	
if(replacedSymbols.equals(Reversename)) {
	System.out.println(Reversename+" is a Palindrome");
}else {
	System.out.println(Reversename+ " is not a Palindome");
}
	
}
}
