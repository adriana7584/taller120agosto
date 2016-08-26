//Pedir al usuario que ingrese el valor del dolar y otra variable con la cantidad
//de dólares y devolver la cantidad de dinero en pesos que tiene la persona


package ejercicio1;

import java.util.Scanner;

class valordolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double cdolar, totalpesos, vdolar;
		System.out.println("Ingrese el valor del dolar: ");
		vdolar = sc.nextdouble();
		System.out.println("Ingrese la cantidad de dolares: ");
		cdolar = sc.nextdouble();
		totalpesos = cdolar*vdolar;
		System.out.println("la cantidad de dolares en pesos es: " +totalpesos);
	}

}
