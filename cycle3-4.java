import java.util.*;
class main
{
	static void area(double r)
	{
		double area=3.14*r*r;
		System.out.println("The area of the circle is"+" "+area);
	}
	
	static void area(float l,float b)
	{
		float area=l*b;
		System.out.println("The area of the rectangle is"+" "+area);
	}
	
	static void area(double b,double h)
	{
		double area=0.5*b*h;
		System.out.println("The area of the triangle is"+" "+area);
	}
	
	public static void main(String args[])
	{
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("To find the area of");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Triangle");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.println("Enter the radius of the circle");
				double r=sc.nextDouble();
				area(r);
				break;
			}
			
			case 2:
				{
					System.out.println("Enter the length of the rectangle");
					float l=sc.nextFloat();
					System.out.println("Enter the breadth of the rectangle");
					float b=sc.nextFloat();
					area(l,b);
					break;
				}
				
			case 3:
				{
					System.out.println("Enter the base of the triangle");
					double b=sc.nextFloat();
					System.out.println("Enter the height of the triangle");
					double h=sc.nextFloat();
					area(b,h);
					break;
				}
			
			default:
			      System.out.println("Enter a valid option");
		}
		
	}
}