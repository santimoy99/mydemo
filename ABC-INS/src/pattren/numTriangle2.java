package pattren;
import java.util.*;
public class numTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n, i,j,k;
       Scanner sc=new Scanner (System.in);
       System.out.println("enter the num of lines");
       n=sc.nextInt();
       for(i=1;i<=n;i++) {
    	   for(k=1;k<=i;k++) {
    		   System.out.print(" ");
    	   }
    	   for(j=1;j<=i;j++) {
    		   System.out.print(j);
    		   
    	   }
    	   System.out.println();
       }
	}

}
