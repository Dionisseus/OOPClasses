package MainClasses;

import java.util.Scanner;

import oopclass1.Humano;
import oopclass1.MathUtil;

public class MainMathUtil {

	public static void main(String[] args) {
		
		
		MathUtil util = new MathUtil();
		util.createAreaCircle(2.23);
		System.out.println(util.createPerimeterCircle(2.23));

		Scanner input = new Scanner (System.in);

		 int number1;
		 int number2;
		 int number3;

		 System.out.println("Enter the First Number");
		
		 number1 = input.nextInt();

		 System.out.println( + number1);
	}

}
