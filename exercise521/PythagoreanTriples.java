package exercise521;

public class PythagoreanTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a<=2500; a++) {
			for (int b =1; b<= 2500; b++) {
				for (int c =1; c<=2500; c++) {
					if ((a*a)+(b*b)==(c*c)) {
						if (b>a) {
							System.out.println( a + "      " +b + "        "+c);
						}
					}
				}
			}
		}

	}

}
