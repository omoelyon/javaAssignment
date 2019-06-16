package exercise522;

public class ModifiedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1 ; i<=10; i++) {
			for (int a=1;a<=i;a++) {
				System.out.print("*");
			}
			for (int b=12-i;b>=1;b--) {
				System.out.print(" ");
			}
			for (int c=10;c>=i;c--) {
				System.out.print("*");
			}
			for (int d=1;d<=i+1;d++) {
				System.out.print(" ");
			}
			for (int e=1;e<=i;e++) {
				System.out.print(" ");
			}
			for (int f=10;f>=i;f--) {
				System.out.print("*");
			}
			for (int g=10-i;g>=1;g--) {
				System.out.print(" ");
			}
			for (int h=1;h<=i;h++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
