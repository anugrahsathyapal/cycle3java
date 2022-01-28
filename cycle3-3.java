import java.util.*;
class main
{
	void frequency(String s,char c)
	{
		int a=0;


        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
                a++;
        }



        System.out.println("the frequency of the given character in the string is "+" "+a);

	}


	void reverse(String s)
	{
		String rev=" ";

		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);

		}
        System.out.println("The reversed string is"+" "+rev);
	}


	public static void main(String args[])
	{
		main str=new main();

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the string to be reversed");
		String s2=sc.nextLine();
		
		str.reverse(s2);
		
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		
		System.out.println("Enter a character to find its frequency in the string");
		char c=sc.next().charAt(0);
        
		str.frequency(s1,c);
		

	}


}