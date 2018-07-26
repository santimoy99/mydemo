package pattren;
import java.util.*;
public class Revtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, i,j,k;
	     Scanner sc=new Scanner (System.in);
	     System.out.println("enter the num of lines");
	     n=sc.nextInt();
	     for( i=1;i<=n;i++) {
	    	 for(j=1;j<=i;j++) {
	    		 System.out.print(" ");
	    	 }
	    	 for(k=1;k<=2*(n-i+1)-1;k++) {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }
		
	}

}
