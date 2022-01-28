import java.util.*;
class main
{
	main(double r)
	{
		double area=3.14*r*r;
		System.out.println("The area of the circle is"+" "+area);
	}
	
	main(double l,double b)
	{
		double area=l*b;
		System.out.println("The area of the rectangle is"+" "+area);
	}
	
	public static void main(String args[])
	{


		Scanner sc=new Scanner(System.in);

		System.out.println("To find the area of");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");

		int choice=sc.nextInt();

		switch(choice)
		{
			case 1:
				{
					System.out.println("Enter the radius of the circle");
					double r=sc.nextDouble();
					main obj=new main(r);
					break;
				}

			case 2:
				{
					System.out.println("Enter the length of the rectangle");
					double l=sc.nextFloat();
					System.out.println("Enter the breadth of the rectangle");
					double b=sc.nextFloat();
					main obj=new main(l,b);
					break;
				}

			

			default:
				System.out.println("Enter a valid option");
		}

	}
}