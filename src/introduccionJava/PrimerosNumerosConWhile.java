
package introduccionJava;
import java.util.Scanner;
/**
 *Programa que utiliza la estructura iterativa While para mostrar los primeros
 * N numeros naturales. El usuario ingresa el valor N por teclado
 * @author Jesús Glz
 */
public class PrimerosNumerosConWhile {
    
    public static void main(String[]args )
    {
        int contador=1, n=0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numero que desea imprimir");
        n = scanner.nextInt();
        
        while(contador <= n){
            //Muestra el valor de contador
            System.out.println("El valor es: "+contador);
            //Incrementamos el valor del contador
            contador++;
        }
    }
    
}
