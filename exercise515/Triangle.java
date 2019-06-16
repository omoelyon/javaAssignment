package exercise515;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int counter =1 ; counter <=10; counter ++) {
			System.out.println(" ");
			for(int i =counter ;i <=10 ; i++) {
				System.out.print("*");
			}
		}
		System.out.println(" ");
		for(int counter =1 ; counter <=10; counter ++) {
			System.out.println(" ");
			for(int i =11-counter ;i <=10 ; i++) {
				System.out.print("*");
			}
		}
		System.out.println(" ");
		System.out.println(" ");

			for(int i =10 ;i>=1 ; i--) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
					if(j==i) {
						System.out.println();
						for(int x=j-9; x<=1;x++) {
							System.out.print(" ");
						}
					}
				}
			}
		}
	}


