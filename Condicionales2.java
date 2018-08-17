package ejerciciosbasicosjava;
    
import java.util.Scanner;
public class Condicionales2 {
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
         int n;
                  
         System.out.println("Ingrese un numero entero de 1 a 7: ");
         n=reader.nextInt();
         
         if(n==1)
             System.out.println("Lunes");
         if(n==2)
             System.out.println("Martes");
         if(n==3)
             System.out.println("Miercoles");
         if(n==4)
             System.out.println("Jueves");
         if(n==5)
             System.out.println("Viernes");
         if(n==6)
             System.out.println("Sabado");
         if(n==7)
             System.out.println("Domingo");
         else
             System.out.println("La opcion no esta considerada");
               
    }     
}
