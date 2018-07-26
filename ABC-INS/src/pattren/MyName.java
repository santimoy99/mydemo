package pattren;

public class MyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int i,j,k;
        for(i=1;i<=5;i++) {
        	for(j=1;j<=3;j++) {
        		System.out.print(" ");
        	}
        	for(k=1;k<=10;k++) {
        		if((i==1)&&(k==2||k==3||k==4||k==5||k==6)) {
        		System.out.print("*");
        		}
        	else if((i==2)&&(k==3)) {
        		System.out.print("*");
        	}
        	else if((i==3)&&(k==3||k==4||k==5||k==6||k==7)) {
        		System.out.print("*");
        	}
        	else if((i==4)&&(k==8)) {
        		System.out.print("    *");
        	}
        	else if((i==5)&&(k==5||k==6||k==7||k==8||k==9)) {
        		System.out.print("*");
        	}
        		}
        	 System.out.println();
        }
        
        
        System.out.println();
        System.out.println();
        
        
        
        for(i=1;i<=4;i++) {
        	for(j=1;j<=3;j++) {
        		System.out.print(" ");
        	}
        	for(k=1;k<=7;k++) {
        		if((i==1)&&(k==1||k==2||k==3||k==5||k==6||k==7)) {
        	System.out.print(" ");
        		}
        		else if((i==2)&&(k==1||k==2||k==6||k==7)){
        			System.out.print(" ");
        		}
        		else if((i==3)&&(k==1||k==3||k==4||k==5||k==7)){
        			System.out.print(" ");
        		}
        		else if((i==4)&&(k==2||k==3||k==4||k==5||k==6)){
        			System.out.print(" ");
        		}
        		else {
        			System.out.print("*");
        		}
        	}
        	System.out.println();
        }
        
        System.out.println();
        
        for(i=1;i<=5;i++) {
        	for(j=1;j<=3;j++) {
        		System.out.print(" ");
        	}
        	for(k=1;k<=4;k++) {
        		if((i==2)&&(k==2||k==3)) {
        	System.out.print(" ");
        		}
        		else if((i==4)&&(k==2||k==4)) {
        			System.out.print(" ");
        		}
        		else if((i==5)&&(k==2||k==3)) {
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