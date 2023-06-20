
import java.util.Scanner;
public class Average 

{
	
	public static void main(String[] args)
	{

		int a,b,c,d,e,f;
		System.out.print("Enter the marks of the six subjects");
		Scanner r =new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		c=r.nextInt();
		d=r.nextInt();
		e=r.nextInt();
		f=r.nextInt();

		int sum= a+b+c+d+e+f;
		System.out.print("Total Markes"+ sum);
		
		double average= sum/6;
		System.out.print("Average marks"+ average);
				
	}
}
