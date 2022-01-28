import java.util.*;
class employee
{
	int empno;
	String empname;
	long empphonenum;

    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		employee no[]=new employee[5];

		for(int i=0;i<5;i++)
		{
			no[i]=new employee();
		}

		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the details of employee"+" "+(i+1));

			System.out.print("Employee number:");
			no[i].empno=sc.nextInt();

                        sc.nextLine();
			System.out.print("Employee name:");
			no[i].empname=sc.nextLine();


			System.out.print("Employee phone number:");
			no[i].empphonenum=sc.nextLong();
			
		}


		for(int i=0;i<5;i++)
		{
			
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("The details of employee"+" "+(i+1)+" "+"is");

			System.out.println("Employee number:"+no[i].empno);
		
			System.out.println("Employee name:"+no[i].empname);
			
			System.out.println("Employee phone number:"+no[i].empphonenum);
			
			}
	}


}