package pattren;
import java.util.*;
public class Demo {
public static void main (String args[]){
	
	int i,j,n;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the num of lines or stars");
	n=sc.nextInt();
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=1;i<=n;i++) {
		for(j=1;j<=n-i+1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
