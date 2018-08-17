package ejerciciosbasicosjava;
import java.util.Scanner;

public class Ciclos2 {
  public static void main(String[] args) {
      Scanner reader = new Scanner (System.in); 
      int a, b, fact=1;

    System.out.println( "Escriba un numero para calcular su factorial" );
    a=reader.nextInt();
 
    for (b=a; b>1; b--){
        fact = fact*b;
    }
    System.out.println("El factorial de "+a+": "+fact );      
    }
}
