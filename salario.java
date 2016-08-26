// Calcula el salario de un empleado, pidiéndole que ingrese 4 variables
//(horas_diurnas, horas_nocturnas, horas_dominicales, horas_festivos),
//las variables deben ser operadasl, tomando como base la siguiente tabla:
//hora diurna: 2500, nocturna: hora_diurna +35%, dominical: hora_diurna + 50%, festivo: hora_diurna + 75%

package ejercicio1;

import java.util.Scanner;

class salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hora_diurna, horas_nocturna, horas_dominical, horas_festivos;
		double vhdiurna, vhnoct, vhdom, vhfest, stotal;
		System.out.println("Ingrese la cantidad de horas trabajadas: ");
		hdiurna=sc.nextDouble();
		hnocturna=sc.nextDouble();
		hdominical=sc.nextDouble();
		hfestivo=sc.nextDouble();
		switch (vhdiurna==2500){
		case vhnoct==vhdiurna+vhdiurna*0.35):
			break;
		case vhdom==vhdiurna+(vhdiurna*0.50):
			break;
		case vhfest==vhdiurna(vhdiurna*0.75):
			break;
		}
		stotal=(vhdiurna*hdiurna)+(vhnoct*hnocturna)+(vhdom*hdominical)+(vhfest*hfestivo);
		System.out.println("El valor total a pagar es: "+stotal);
		
	}

}
