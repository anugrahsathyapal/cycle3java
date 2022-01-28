import java.util.*;
class main
{
                void factorial(int n)
		{
			int f=1,i;
			for(i=1;i<=n;i++)
			    f=f*i;
			System.out.println(n+"!"+"="+f);
		}
		
		void sumofdigits(int n)
		{
			int sum=0,dg;
			
			while(n!=0)
			{
				dg=n%10;
				sum=sum+dg;
				n=n/10;
			}
			
			System.out.println("sum of digits:"+sum);
		}
		
		public static void main(String args[])
		{
			main num=new main();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number to find the factorial");
			int n=sc.nextInt();
			
			System.out.println("Enter the number to find the sum of digits");
			int m=sc.nextInt();
			
			num.factorial(n);
			num.sumofdigits(m);
		}
		
		
	
}