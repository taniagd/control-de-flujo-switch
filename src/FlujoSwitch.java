import java.util.Scanner;

public class FlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch(condici�n) {
		 * case valor:
		 * 			c�digo
		 * 			c�digo
		 * 			c�digo
		 * 			break;
		 * case valor2:
		 * 			c�digo
		 * 			c�digo
		 * 			c�digo
		 * 			break;
		 * default:
		 * 	c�digo por defecto
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
				mensaje = "Mi�rcoles";
				break;
			case 4:
				mensaje = "Jueves";
				break;
			case 5:
				mensaje = "Viernes";
				break;
			case 6:
				mensaje = "S�bado";
				break;
			case 7:
				mensaje = "Domingo";
				break;
			default:
				mensaje = "D�a inv�lido";
				break;
		}
		
		System.out.println(mensaje); */
		
		/* Crear una calculadora que pueda sumar, restar, multiplicar y dividir
		 dos n�meros. 
		 La calculadora debe pedir los dos n�meros y qu� operaci�n se quiere realizar.
		 El men� es el siguiente: 
		 1. Suma
		 2. Resta
		 3. Multiplicaci�n.
		 4. Divisi�n.
		 
		  Al final debe mostrar los resultados de la operaci�n.
		  Debemos usar el switch.
		 */
	
		/*Scanner operation= new Scanner(System.in);
		System.out.println("Introduzca el primer n�mero");
		int numberOne = operation.nextInt();
		System.out.println("Introduzca el segundo n�mero");
		int numberTwo = operation.nextInt();
		System.out.println("Seleccione el n�mero coorespondiente a la operaci�n que quiera realizar:");
		System.out.println("1 Suma");
		System.out.println("2 Resta");
		System.out.println("3 Multiplicaci�n");
		System.out.println("4 Divisi�n");
		int calculator = operation.nextInt();
		
		
		switch(calculator) {
		case 1:
			 System.out.println("El total de la suma es " + (numberOne + numberTwo));
			break;
		case 2:
			 System.out.println("El total de la resta es " + (numberOne - numberTwo));
			break;
		case 3:
			 System.out.println("El total de la multiplicaci�n es " + (numberOne * numberTwo));
			break;
		case 4:
			 System.out.println("El total de la divisi�n es " + (numberOne / numberTwo));
			break;
		default:
			System.out.println("Opci�n inv�lida");
			break;
			
		}*/

		/*Crear un programa donde se introduzcan los tres �ngulos internos
		 de un tri�ngulo y se determine si el tri�ngulo es v�lido o no.*/
		

		Scanner angletriangle = new Scanner(System.in);
		System.out.println("Introduzca el primer �ngulo interno del tri�ngulo");
		float angleOne = angletriangle.nextFloat();
		System.out.println("Introduzca el segundo �ngulo interno del tri�ngulo");
		float angleTwo = angletriangle.nextFloat();
		System.out.println("Introduzca el tercer �ngulo interno del tri�ngulo");
		float angleThree = angletriangle.nextFloat();
		
		float triangle = angleOne + angleTwo + angleThree;
		
		if (triangle == 180) {
			System.out.println("El tri�ngulo es v�lido");
		} else {
			System.out.println("El tri�ngulo es inv�lido");
		}
	}
}

