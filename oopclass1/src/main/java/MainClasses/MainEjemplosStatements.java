package MainClasses;

import oopclass1.Humano;
import oopclass1.MathUtil;

public class MainEjemplosStatements {

	public static void main(String[] args) {
		System.out.println("Clase de prueba para checar humanos");
		//Instanciacion con parametros
		Humano caro = new Humano(40, 1, 100, "Carolina Plasencia");


		int i = 10;

		i += 1; // i = i + 1

		i %= 2; // i = i % 2
		
		
		boolean bol = false;
		// SI bol es true Y i es igual a 1
		if (bol && i == 1) {
			System.out.println("si es");
		} else {
			System.out.println("no es");
		}

		//makes a switch of the value of caro.getEdad.
		switch (caro.getEdad()) {
		case 30:
			System.out.println("Humano tiene 30");
			break;
		case 40:
			System.out.println("Humano tiene 40");
			break;
		default:
			System.out.println("No se pudo determinar la edad");
		}
		
		while(bol) {
			System.out.println("LOOP con valor de i = "+i++);
		}
		//Example of a for
		for(int j =0; j<=10; j++) {
			if(j==5) {
				break;
			}
			System.out.println("uso del for con j = "+j);
		}
		

	}

}
