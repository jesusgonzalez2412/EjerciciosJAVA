package introduccionJava;
import java.util.Scanner;
/**
 *Programa que pide al usuario que ingrese su nombre, lee el dato por el teclado
 * y luego lo muestra en consola.
 * @author Jesús Glz
 */
public class HolaMundoNombre {
    public static void main (String[] args)
    {
        //Esta clase permite leer datos por teclado
        Scanner leer = new Scanner(System.in);
        //Mensaje para el usuario para solicitar datos
        System.out.print("Ingrese su nombre: ");
        //Leemos el valor ingresado
        String nombre = leer.nextLine();
        //Mostramos un mensaje y el valor ingresado
        System.out.println("Hola, Bienvenido al curso: "+nombre);
    }
    
}
