//Pedir al usuario que ingrese la base y la altura
//de un triángulo, y calcular su área (base x altura/2).
//Dibujar el triángulo con puntos

package ejercicio1;

import java.util.Scanner;

class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	float area_triangulo = 0;
	int base, altura;
	System.out.println("Introduce el valor de la base y de la altura");
	base = sc.nextInt();
	altura = sc.nextInt();
	area_triangulo = (float) (base*altura)/2;
	System.out.println("El área del triángulo es -> " + area_triangulo);
	
	}

}
