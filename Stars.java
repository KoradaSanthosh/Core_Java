package Basics;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=9;
	        int p=1;
	        for(int i=0;i<=n;i+=2)
	        {
	            for(int k=0;k<p;k++)
	            {
	                System.out.print(" ");
	            }
	            for(int j=1;j<=n-i;j++)
	            {
	                System.out.print("*");
	                
	            }    
	            System.out.println();
	            p++;
	            
	        }
	        
	       
	}

}
