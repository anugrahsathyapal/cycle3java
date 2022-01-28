import java.util.*;
class student
{
	String name;
	int rollno;
	int mark[]=new int[5];
	
	void read()
	{
		Scanner st=new Scanner(System.in);
		
		System.out.println("enter the name");
		name=st.nextLine();
	    
		System.out.println("enter the roll number");
		rollno=st.nextInt();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the marks of subject"+" "+(i+1));
			mark[i]=st.nextInt();
		}
		
	    
	}
	
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll No:"+rollno);
		for(int i=0;i<5;i++)
		{
			System.out.println("Marks of subject"+" "+(i+1)+" "+"is"+" "+mark[i]);
		}
		
	}

}
	
class main
{
	public static void main(String args[])
	{
		student s1=new student();
		s1.read();
		s1.display();
	}
}