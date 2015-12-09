package introduccionJava;
import java.util.Scanner;
/**
 *Programa que termina si una edad es mayor que 18 años con la condicion IF
 * @author Jesús Glz
 */
public class EsMayorQue18 {
    public static void main (String[] ars)
    {
        int edad=0;
        //Instancia del Clase Scanner para leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        //Lee edad introducio por teclado
        edad = scanner.nextInt();
        if(edad>= 18){
            System.out.println("Ud. es mayor de edad !!");
        }
        else{
            System.out.println("Ud. Es menor edad !!");
        }
        
    }
    
}
