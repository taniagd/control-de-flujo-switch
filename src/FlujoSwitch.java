import java.util.Scanner;

public class FlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch(condición) {
		 * case valor:
		 * 			código
		 * 			código
		 * 			código
		 * 			break;
		 * case valor2:
		 * 			código
		 * 			código
		 * 			código
		 * 			break;
		 * default:
		 * 	código por defecto
		 */
		
		/* int dia = 7;
		String mensaje = "";
		
		switch(dia) {
			case 1:
				mensaje = "Lunes";
				break;
			case 2:
				mensaje = "Martes";
				break;
			case 3:
				mensaje = "Miércoles";
				break;
			case 4:
				mensaje = "Jueves";
				break;
			case 5:
				mensaje = "Viernes";
				break;
			case 6:
				mensaje = "Sábado";
				break;
			case 7:
				mensaje = "Domingo";
				break;
			default:
				mensaje = "Día inválido";
				break;
		}
		
		System.out.println(mensaje); */
		
		/* Crear una calculadora que pueda sumar, restar, multiplicar y dividir
		 dos números. 
		 La calculadora debe pedir los dos números y qué operación se quiere realizar.
		 El menú es el siguiente: 
		 1. Suma
		 2. Resta
		 3. Multiplicación.
		 4. División.
		 
		  Al final debe mostrar los resultados de la operación.
		  Debemos usar el switch.
		 */
	
		/*Scanner operation= new Scanner(System.in);
		System.out.println("Introduzca el primer número");
		int numberOne = operation.nextInt();
		System.out.println("Introduzca el segundo número");
		int numberTwo = operation.nextInt();
		System.out.println("Seleccione el número coorespondiente a la operación que quiera realizar:");
		System.out.println("1 Suma");
		System.out.println("2 Resta");
		System.out.println("3 Multiplicación");
		System.out.println("4 División");
		int calculator = operation.nextInt();
		
		
		switch(calculator) {
		case 1:
			 System.out.println("El total de la suma es " + (numberOne + numberTwo));
			break;
		case 2:
			 System.out.println("El total de la resta es " + (numberOne - numberTwo));
			break;
		case 3:
			 System.out.println("El total de la multiplicación es " + (numberOne * numberTwo));
			break;
		case 4:
			 System.out.println("El total de la división es " + (numberOne / numberTwo));
			break;
		default:
			System.out.println("Opción inválida");
			break;
			
		}*/

		/*Crear un programa donde se introduzcan los tres ángulos internos
		 de un triángulo y se determine si el triángulo es válido o no.*/
		

		Scanner angletriangle = new Scanner(System.in);
		System.out.println("Introduzca el primer ángulo interno del triángulo");
		float angleOne = angletriangle.nextFloat();
		System.out.println("Introduzca el segundo ángulo interno del triángulo");
		float angleTwo = angletriangle.nextFloat();
		System.out.println("Introduzca el tercer ángulo interno del triángulo");
		float angleThree = angletriangle.nextFloat();
		
		float triangle = angleOne + angleTwo + angleThree;
		
		if (triangle == 180) {
			System.out.println("El triángulo es válido");
		} else {
			System.out.println("El triángulo es inválido");
		}
	}
}

