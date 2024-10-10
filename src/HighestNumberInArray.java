
public class HighestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,2,20,8,40,19};
		int max  = numbers[0];
		for(int i=1;i<numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Highest number is :: " + max);

	}

}
