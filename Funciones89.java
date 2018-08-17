package ejerciciosbasicosjava;
import java.util.Scanner;
public class Funciones89 
{
    static Scanner entrada=new Scanner(System.in);
    static int a, b , x=1, k;
  
    static void ingresar()
    {
        System.out.println ("Ingrese un numero");
        a=entrada.nextInt(); 
        
    } 
    
    static int factorial(int a, int b)
    {
    int x=1;	
            for ( b=a ;b>1;b--)
            {
                    x=x*b;
            }
        
        return x;
    }

    public static void main(String[] args)  
    {
      int x;
      ingresar();
      
      k=factorial(a,b);
          System.out.println("El factorial es; "+k);	
    }
    
}
