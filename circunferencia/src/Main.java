import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
        double radio, longitud, area, volumen;
        final double Pi = 3.1416;

        System.out.println("=== Longitud y área de la circunferencia y volumen de una esfera ===");
        System.out.println();

        System.out.print("Radio en cm: ");
        radio = lector.nextDouble();

        System.out.println("============ Circunferencia ============");
        longitud = 2 * Pi * radio;
        System.out.println("Longitud: " + longitud + " cm");

        area = Pi * Math.pow(radio, 2);
        System.out.println("Area: " + area + " cm^2");
        System.out.println();

        volumen = (4.0 / 3.0) * Pi * Math.pow(radio, 3);
        System.out.println("================ Esfera ================");
        System.out.println("Volumen: " + volumen + " cm^3");

	}

}
