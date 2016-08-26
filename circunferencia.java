//pedir al usuario que ingrese el valor del radio de una circunferencia
//y devolver el área de la circunferencia (pi x radio ^2), 
//diametro de la circunferencia (2 x pi)
//y longitud de la circunferencia (2 x pi x radio)

package ejercicio1;

import java.util.Scanner;

class circunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radio, area, diametro, longitud;
		System.out.println("Introduce radio de la circunferencia:");
		radio = sc.nextDouble();
		area = Math.PI * Math.pow(radio, 2);
		longitud = 2 * Math.PI * radio;
		diametro = 2 * Math.PI;
		System.out.println("Longitud de la circunferencia -> "+ longitud);
		System.out.println("Area de la circunferencia -> " + area);
		System.out.println("Diametro de la circunferencia -> " + diametro);
	}

}
