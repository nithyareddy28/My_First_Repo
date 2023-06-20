
	import java.util.Scanner;
public class Calculateaverage {

		public static void main(String[] args)
{
			Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter first number");
			float num1 = sc.nextFloat();
			
			System.out.println("Enter second number");
			float num2 = sc.nextFloat();
			
			System.out.println("Enter third number");
			float num3 = sc.nextFloat();
			
			
			System.out.println("Enter fourth number");
			float num4 = sc.nextFloat();
			
			System.out.println("Enter fifth number");
			float num5 = sc.nextFloat();
			
			System.out.println("Enter sixth number");
			float num6 = sc.nextFloat();
			
			float avg =(num1 + num2+ num3+ num4+ num5 + num6)/6;
			System.out.println("Average for the entered numbers is"+ avg);
			
		}
	

}
