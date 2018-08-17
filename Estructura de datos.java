
import java.util.Scanner;

/*Escribir un programa que almacene en un arreglo de estructuras las características de cada
persona: nombre, sexo, edad, peso, color de pelo, color de piel, color de ojos, nacionalidad y
teléfono.
 */

public class Caracteristicas {
    public static void main( String[] args ){
     Scanner lea = new Scanner (System.in);
     
     Personas a[]= new Personas[2];
     
    String  nombres ="";
    String sexo = "";
    int  edad =0;
    int  peso=0;
    String colorpelo ="";
    String  colorpiel = "";
    String  colorojos = "";
    String  nacionalidad = "";
    String  telefono = "";
    
    for (int i= 0;i<a.length;i++){
       
       
       
       System.out.print("Nombre : ");
       nombres = lea.next();
       System.out.print("Sexo : ");
       sexo = lea.next();
       System.out.print("Edad : ");
       edad = lea.nextInt();
       System.out.print("Peso : ");
       peso = lea.nextInt();
       System.out.print("Color de pelo : ");
       colorpelo = lea.next();
       System.out.print("Color de piel : ");
       colorpiel = lea.next();
       System.out.print("Color de ojos : ");
       colorojos = lea.next();
       System.out.print("Nacionalidad  : ");
       nacionalidad = lea.next();
       System.out.print("Telefono : ");
       telefono= lea.next();
    
  
   System.out.println("__________________ Lista de Personas_______________");
   System.out.println("Nombre: " + nombres);
   System.out.println("Sexo : " + sexo);
   System.out.println("Edad  : " + edad );
   System.out.println("Peso : " + peso);
   System.out.println("Color de pelo:" + colorpelo);
   System.out.println("Color de piel : " + colorpiel );
   System.out.println("Color de ojos : " + colorojos );
   System.out.println("Nacionalidad : " + nacionalidad);
   System.out.println("Telefono : " + telefono);

    }
    }
    
}

