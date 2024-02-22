package operacionesBasicasFloat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
        float num1, num2, suma, resta, producto, division;

        System.out.println("=== Operaciones básicas ===");
        System.out.println();

        System.out.print("Número 1: ");
        num1 = lector.nextFloat();

        System.out.print("Número 2: ");
        num2 = lector.nextFloat();
        System.out.println();

        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            System.out.println("No se puede dividir entre cero.");
            return;
        }

        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + producto);
        System.out.println(num1 + " / " + num2 + " = " + division);
	}

}
