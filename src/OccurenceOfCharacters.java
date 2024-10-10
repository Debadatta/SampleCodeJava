import java.util.HashMap;

//Using HashMap
public class OccurenceOfCharacters {

	public static void main(String[] args) {
		String str = "I am Debadatt Pradhan";
		char[] chars = str.toCharArray();
		HashMap<Character, Integer> charOccurence = new HashMap<Character, Integer>();
		for(char ch : chars) {
			if(charOccurence.containsKey(ch)) {
				charOccurence.put(ch, charOccurence.get(ch) +1);
			} else  {
				charOccurence.put(ch, 1);
			}
		}
		System.out.println(charOccurence);
	}

}
