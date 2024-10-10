
public class ReverseEachWord {

	public static void main(String[] args) {
		String name = "Debadatt Pradhan";
		String[] nameArray = name.split(" ");
		String newRevStr = "";
		for(String nameWord : nameArray) {
			newRevStr = newRevStr + " " + reverseNum(nameWord);
			
		}

		System.out.println(newRevStr);
	}
	
	public static String reverseNum (String str) {
	
		String reversedStr = "";
		for (int i = 0; i < str.length(); i++) {
			  reversedStr = str.charAt(i) + reversedStr;
		}
		return reversedStr;
		
	}

}
