package exercises;

public class Exercise512 {
	
	private static int max =15;
	private static int product = 1;
	
	public static int calOddProducts() {
		
		for(int i = 1; i <= max; i+=2) {
			product *= i;
		}
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Exercise512.calOddProducts());

	}

}
