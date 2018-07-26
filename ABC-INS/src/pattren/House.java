package pattren;

public class House {
	public static void main (String args[]) {
		int i,j,k;
		for (i=1;i<=5;i++) {
			for(j=1;j<=5-i+1;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=5;i++) {
			for(j=1;j<=1;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=9;k++) {
				if((i>1) && (k==4||k==5||k==6)){
					
					System.out.print(" ");
					
				}
				else {
				System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}

}
