
public class DuplicateLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Debadatt Pradhan";
		char[] charName = name.toCharArray();
		int count;
		for(int i= 0; i<charName.length; i++) {
			count = 1;
			for(int j=i+1 ; j < charName.length; j++) {
				if(charName[i] == charName[j] && charName[i]!= ' ') {
					count++;
					charName[j]= '0';
				}
			}
			
			if(count > 1 && charName[i]!= '0') {
				System.out.println(charName[i] + " is duplicate");
			}

		}
		
		
	}

}
