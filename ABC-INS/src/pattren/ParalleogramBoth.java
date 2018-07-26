package pattren;

public class ParalleogramBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,k;
         for(i=0;i<=5;i++) {
        	 for(j=1;j<5-i+1;j++) {
        		 System.out.print(" ");
        	 }
        	 for(k=1;k<=5;k++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         
         for(i=1;i<=5;i++) {
        	 for(j=1;j<=i;j++) {
        		 System.out.print(" ");
        		 
        	 }
        	 for(k=1;k<=5;k++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

	}


