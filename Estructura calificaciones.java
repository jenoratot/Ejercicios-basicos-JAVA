
/*Escribir un programa que almacene en un arreglo de estructuras los nombres de los
alumnos, sus notas parciales y finales. Hallar la nota media y mostrar un mensaje de APTO
si el alumno supera o iguala la calificación de 3.5 o NO APTO si no lo alcanza. Hacerlo para
un número de 5 alumnos. */
import java.util.Scanner;
public class Notas {
    public static void main( String[] args ){
     Scanner sc = new Scanner (System.in);
     Notas2 a[]= new Notas2[5];
     
        String Nombre ="";
        double NotaP= 0 ;
        double NotaF= 0 ;
        double suma = 0;
        double Promedio = 0;
        
     for (int i= 0;i<a.length;i++){
        System.out.print("ingese el nombre de estudiante :");
        Nombre = sc.next();
        System.out.print("ingese la nota parcial del estudiante :");
        NotaP = sc.nextDouble();
        System.out.print("ingese la nota Final del estudiante :");
        NotaF = sc.nextDouble();
        sc.nextLine();

       suma = NotaP+NotaF;
       Promedio = suma/2;
       
       if (Promedio >= 35){
       System.out.println(" el alumno " + Nombre +  " tuvo un promedio " + Promedio +  " de manera que aprobo el curso ");   
       }
       else {
           System.out.println(" el alumno " + Nombre +  " tuvo un promedio  " + Promedio +  " de manera que reprobo  el curso ");
       }
     }
     }
}
    
   


