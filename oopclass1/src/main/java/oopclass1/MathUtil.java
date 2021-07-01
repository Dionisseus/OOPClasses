package oopclass1;

import java.util.Scanner;

public class MathUtil {
	double perimetro;
	
	public double createPerimeterCircle(double radius) {
		perimetro = Math.PI * radius * 2;
		return Math.PI * radius * 2;
	}
	public double createAreaCircle(double radius) {
		return Math.PI * radius * radius;
	}
	
	public int productOfIntegers() {
		Scanner input = new Scanner (System.in);

		 int number1;
		 int number2;
		 int number3;

		 System.out.println("Enter the First Number");
		
		 number1 = input.nextInt();

		 System.out.println( + number1);
		 System.out.println("Enter the Second Number");
		 number2 = input.nextInt();

		 System.out.println("Enter the Third Number");
		 number3 = input.nextInt();
		 input.close();
		 return( number1 * number2 *number3);
		 }

}