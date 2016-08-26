//Pedir al usuario que ingrese un numero y retornar la tabla de multiplicar 
//del numero ingresado del 1 al 10

package ejercicio1;

class tablamultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;		
		int resultado;				
		Scanner entradaNumero = new Scanner(System.in);						
		System.out.println("Por favor ingrese el numero a multiplicar");				
		numero = entradaNumero.nextInt();				
		System.out.println("La tabla de multiplicar del numero " + numero + " es: ");				
		for(int c = 1; c <= 10; c++) {
					resultado = numero * c;					
		System.out.println(numero + " x " + c + " = " + resultado);
				
		}
		}
}
