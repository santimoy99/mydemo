package pattren;
import java.util.*;
public class TriangleBoth {
     public static void main(String args[]) {
    	 int n,i,j,k;
    	 Scanner sc =new Scanner(System.in);
    	 System.out.println("enter the lines");
    	 n=sc.nextInt();
    	 for(i=1;i<=n;i++) {
    		 for(j=1;j<=n-i+1;j++) {
    			 System.out.print(" ");
    			 
    		 }
    		 for(k=1;k<=2*i-1;k++) {
    			 System.out.print("*");
    		 }
    		 System.out.println();
    	 }
    	 
    	 for(i=1;i<=n;i++) {
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
