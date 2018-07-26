package pattren;
import java.util.*;
public class Acat_pattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i,j,k,n,a=1;
          Scanner sc =new Scanner (System.in);
          System.out.println("enter the no of n");
           n=sc.nextInt();
           
           for(i=1;i<=n;i++) {
        	   a=((i*(i+1))+1)/2;
        	   for(k=1;k<i;k++) {
        		   System.out.print((a--)+"*");
        	   }
        	   System.out.println(a);
           }
 
	}
	/*int N=5;// it taken by user but my case it set as a static
	for(int i=1;i<=N;i++)
	{
	int k=i*(i+1)/2;
	for(int j=1;j<=i;j++)
	{
	System.out.print(k);
	/*if(j!=i)
	System.out.print("*");*/
	//k--;
	//}
	//System.out.println();
	//}*/
}
