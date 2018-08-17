package ejerciciosbasicosjava;

import java.util.Scanner;

public class Funciones97 
{
    static Scanner entrada=new Scanner(System.in);
    static int a,b,w,z;
    
    static void ingresar()
    {
        System.out.println("Ingrese un numero");
        a=entrada.nextInt(); 
        System.out.println("Ingrese otro numero");
        b=entrada.nextInt();        
       
    }

    static int mayor (int a,int b)
    {
    int x;	
            if(a>b)
            {
                    x=a;
            }
            else
            {
                    x=b;
            }
    return x;		
    }

    static int menor (int a,int b)
    {
    int x;	
            if(a<b)
            {
                    x=a;
            }
            else
            {
                    x=b;
            }
    return x;	
    }

    public static void main(String[] args) 
    {
      	ingresar();
        
        w=mayor(a,b);
	z=menor(a,b);

	System.out.println("Mayor numero:"+w);
	System.out.println("Menor numero:"+z);
    
        
    }
    
}
