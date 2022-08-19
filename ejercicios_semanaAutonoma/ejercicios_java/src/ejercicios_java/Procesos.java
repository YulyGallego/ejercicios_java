package ejercicios_java;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Procesos {

	
	public void ejercicio2(){
		int c = 8;
		int a = 2;
		int b = -2;
		c = (a*b)+2;
		a = a-2 + b * ( b + 3 )-c ;
		b = c;
		
		System.out.println("ejercicio2 "+a+" "+b+" "+c);
	}

	public void ejercicio3() {
		int valor = 60000;
		int porcentaje = 15;
		double total =(porcentaje*valor)/100;
		System.out.println("ejercicio3 "+total);
	}
	public void ejercicio4() {
		Scanner SC = new Scanner(System.in);
		int porcentaje2 = 15;
		System.out.println("ingrese el valor: ");
		int valor2 = SC.nextInt();
		System.out.println("ejercicio4 "+" El 15% de"+valor2+"es:"+(porcentaje2*valor2)/100);
	}
	public void ejercicio5() {
		double anteriorSalario = 60000;
		int porcentaje3 = 25;
		double total = (anteriorSalario* porcentaje3)/100;
		double total2 = (anteriorSalario + total);
		System.out.println("ejercicio5 "+" su nuevo salario es de: "+ total2);
	}
	public void ejercicio6() {
		int valorHora = 3000;
		double sueldo = 60000;
		int horasExtra = 4;
		double total1 = (valorHora*horasExtra)+sueldo; 
		
		System.out.println("ejercicio6 "+" su sueldo es de: "+ (total1));
	}
	public void ejercicio7() {
		double costoTratamiento = 80000;
		int numeroDias = 4;
		double costoMedicamentos = 30000;
		int costoDia = 100000;
		double total1 = (numeroDias * costoDia)+costoTratamiento;
		double total2 = (total1+costoMedicamentos);
		System.out.println("ejercicio7 "+total2);
	}
	public void ejercicio8() {
		double base = 5;
		double altura = 4;
		double area = (base*altura)/2;
		System.out.println("ejercicio8 "+area);
	}
	public void ejercicio9() {
		double a = 2;
		double b = 4;
		double x = (b*2*a)+a;
		System.out.println("ejercicio9 "+x);
	}
	public void ejercicio10() {
		double num1 = 5.8;
		double num2 = 7.5;
		double num3 = 3.2;
		double total = (num1 + num2 + num3);
		System.out.println("ejercicio10 "+total);
		
	}
	public void ejercicio11() {
		double num1 = 5.8;
		double num2 = 7.5;
		double num3 = 3.2;
		double total = (num1 + num2 + num3)*2;
		System.out.println("ejercicio11 "+total);
	}
	public void ejercicio12() {
		double nota1 = 5;
		double nota2 = 4.5;
		double nota3 = 3.5;
		double notaFinal = (nota1 + nota2 + nota3)/3;
		System.out.println("ejercicio12 "+notaFinal);
	}
	public void ejercicio13() {
		String nombre = "Pepito Pérez";
		int documento = 10934566;
		int edad = 21;
		String profesion = "Estudiante";
		
		System.out.println("ejercicio13 " +                           "Datos ingresados:");
		System.out.println(                                           "Nombre completo: "+ nombre);
		System.out.println(                                           "Documento: "+ documento);
		System.out.println(                                           "Edad:"+ edad);
		System.out.println(                                           "Profesíon:"+ profesion);
		System.out.println(                                           "Bienvenido!!!");
				
	}
	public void ejercicio16() {
		double precio = 2000;
		int cantidad = 2;
		double valorResivido = 3000;
		double totalPagar = (precio * cantidad);
		double devuelta = (valorResivido - totalPagar);
		
		if (totalPagar >= valorResivido) {
			System.out.println("la devuelta es de: " + devuelta);
		}else {
			System.out.println("te falta para pagar la cuenta");
		}
		
	}

	public void ejercicio17() {
		String nombre = "Pepito Pérez";
		int documento = 10934566;
		int edad = 21;
		String profesion = "Estudiante";
		String telefono = "3113841824";
		
		System.out.println("ejercicio13 " + "Datos ingresados:");
		System.out.println("Nombre completo: "+ nombre);
		System.out.println("Documento: "+ documento);
		System.out.println("Edad:"+ edad);
		System.out.println("Profesíon:"+ profesion);
		System.out.println("telefono: "+ telefono);
	}
	public void ejercicio21() {
		int horasTrabajadas = 10;
		int valorHora = 2000;
		int impuesto = 10;
		double sueldo1 = (horasTrabajadas * valorHora);
		double sueldo2 =(sueldo1 * impuesto)/100;
		System.out.println(sueldo2);
		
	}
	public void ejercicio25() {
		Scanner SC = new Scanner(System.in);
		double anteriorSalario = 60000;
		System.out.println("ingrese el incremento: ");
		int incremento = SC.nextInt();
		double total = (anteriorSalario* incremento)/100;
		double total2 = (anteriorSalario + total);
		System.out.println("ejercicio5 "+" el nuevo salario es de: "+ total2);
	}
	public void ejercicio26() {
		int n = 5;
		double suma = (n*(n+1)/2);
		System.out.println(suma);
	}
	public void ejercicio27() {
		double nota1 = 4.5;
		double nota2 = 5;
		double trabajos = 2.3;
		double examen = 3;
		double total = ((nota1 * 0.2)+(nota2 * 0.2)+(trabajos * 0.3)+(examen * 0.3));
		System.out.println(total);
	}
	public void ejercicio28() {
		double monto = 5;
		int plazoDias = 6;
		double tasaInteresAnual = 7;
		double total = (monto * tasaInteresAnual * plazoDias)/360;
		System.out.println(total);
	}
	//ciclosfor

	public void ejerciciociclos10() {
		double suma = 0;
		double decimales [] = {5.8, 4.3, 4.2};
		for(int i = 0;i < decimales.length; i++) {
			suma += decimales[(int) i];
		
		}System.out.println("ejercicio10ciclos "+ suma);
	}
	public void ejerciciociclos11() {
		double suma = 0;
		double decimales [] = {5.8, 4.3, 4.2};
		for(int i = 0;i < decimales.length; i++) {
			suma += decimales[(int) i]*2;
		
		}System.out.println("ejercicio11ciclos "+ suma);
	}
	//cicloswhile
	public void ejerciciociclo6() {
		int i=0;
		while(i<5) {
			JOptionPane.showMessageDialog(null, "sueldo "+(i+1));
	        double valorHora=3000;
	        double sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
	        double horasExtras=Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de horas extras"));
	       
	        double sueldoTotal=(valorHora*horasExtras)+sueldo;
	        System.out.println(" su sueldo total es: "+sueldoTotal);
			i++;
		}
	}
	public void ejerciciociclo8() {
		int i=0;
		while(i<6) {
			JOptionPane.showMessageDialog(null, "area "+(i+1));
	        double base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la base"));
	        double altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura"));
	        
	        double area=(base * altura)/2;
	        System.out.println(" el valor de la area del triangulo es: "+area);
			i++;
		}
	}

	//ciclosdowhile


	    public void ejerciciosciclo12()
	    {
	        int i=0;
	        do {
	            JOptionPane.showMessageDialog(null, "promedio "+(i+1));
	            double nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
	            double nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
	            double nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));
	           
	            double promedio=(nota1+nota2+nota3)/3;
	            System.out.println(" su promedio es: "+promedio);
	            i++;
	        } while (i<3);
	    }
	    
	    public void ejerciciosciclo3() {
	    	int i=0;
	    	do {
	    		JOptionPane.showMessageDialog(null, " valor "+(i+1));
	    		double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor numerico"));
	    		double porcentaje = 15;
	    		
	    		double total = (porcentaje*valor)/100;
	    		System.out.println("el 15% del valor ingresado es:" + total);
	    		i++;
	    	}while (i<4);
	    }
	   
	   int valor 1 = 0;
	    
	}



