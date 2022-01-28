import java.util.*;
class main
{
	static void concatenate(int a,int b)
	{
		System.out.println("The concatenated number is");
		System.out.println(""+a+b);
	}
	
	static void concatenate(String a,String b)
	{
		System.out.println("The concatenated string is");
		System.out.println(a+b);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first string");
		String s1=sc.nextLine();
		
		System.out.println("Enter the second string");
		String s2=sc.nextLine();
		
		concatenate(s1,s2);
		
		System.out.println("Enter the first number");
		int n1=sc.nextInt();

		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		
		concatenate(n1,n2);
	}
}