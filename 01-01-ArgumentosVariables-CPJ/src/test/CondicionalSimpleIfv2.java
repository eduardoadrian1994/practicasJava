package test;

import java.util.Scanner;

public class CondicionalSimpleIfv2 {
		public static void main(String[]args) {
			Scanner teclado = new Scanner(System.in);
			
			int num1;
	        int num2;
	        System.out.print("Introduce un número para comparar: ");
	        num1 = teclado.nextInt();
	        System.out.print("Introduce otro número para comparar: ");
	        num2 = teclado.nextInt();
	        if(num2>num1) {
				System.out.println("El num2 es mayor el num1");
			}
	        teclado.close();
			}			
}

