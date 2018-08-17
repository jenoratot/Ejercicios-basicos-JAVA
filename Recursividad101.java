package recursividad.pkg101;

import java.util.Scanner;
public class Recursividad101{
    public static void main(String []args){
      Scanner S= new Scanner (System.in);
      int a,b,c;//
      System.out.println("Ingrese un numero");
      a=S.nextInt();
      System.out.println("Ingrese otro numero");
      b=S.nextInt();
      c=multiplicacion(a,b);
      System.out.println("= "+ c);
                        }
    static int multiplicacion(int a, int b){
        if(b==0) 
          return 0;
        else
          return (a+multiplicacion(a,b-1));   
                        }
        }  