package ejerciciosbasicosjava;

import java.util.Scanner;
public class Condicionales1 {
     public static void main(String[] args) {
         Scanner reader = new Scanner (System.in);
         int a;
                  
         System.out.println("Ingrese un numero entero: ");
         a=reader.nextInt();
         
         if(a>0)
             System.out.println("El numero es Positivo");
         else
             System.out.println("El numero Es Negativo");
     }
}

