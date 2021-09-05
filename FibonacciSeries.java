package week1day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n1=0,n2=1,sum,i,range=8;    
		 System.out.println(n1+" "+n2);
		    
		 for(i=2;i<8;++i)
		 {    
		  sum=n1+n2;    
		  System.out.println(" "+sum);    
		  n1=n2;    
		  n2=sum;    
		 }    
		  
		}}  
			



			