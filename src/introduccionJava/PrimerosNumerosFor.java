
package introduccionJava;
import java.util.Scanner;
/**
 *El programa mostrara los numeros naturales (utilizando el ciclo FOR)
 * @author Jesús Glz. <jesusgonzalez2412@gmail.com>
 */
public class PrimerosNumerosFor {
    
    public static void main(String[ ]args)
    {
        int numero=0;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese un valor numerico: ");
        numero = scanner.nextInt();
        
        for (int i=0; i<=9; i++)
        {
            System.out.println("Los numero son: "+ i);
        }
        
    }
    
}
