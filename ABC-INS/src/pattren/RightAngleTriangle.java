package pattren;
import java.util.*;
public class RightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,k;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the num of stars and lines");
        n=sc.nextInt();
        for(i=n;i>=1;i--) {
        	for(k=1;k<=n;k++) {
        		System.out.print(" ");
        	}
        	for(j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	
        	System.out.println();
        }
	}

}
