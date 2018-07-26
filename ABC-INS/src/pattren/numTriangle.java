package pattren;
import java.util.*;
public class numTriangle {
public static void main(String args[]) {
	int n,i,j,k;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the num which you want to print");
    n=sc.nextInt();
    
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
}
