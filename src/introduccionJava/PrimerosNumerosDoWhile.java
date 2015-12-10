
package introduccionJava;
import java.util.Scanner;
/**
 *Programa muestra números naturales utilizando do-while
 * @author Jesús Glz. <jesusgonzalez2412@gmail.com>
 */
public class PrimerosNumerosDoWhile {
        
    public static void main(String[]args)
    {
        int contador=1, n=0;
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingrese un valor ");
        n = scanner.nextInt();
        
        do
        {
            System.out.println("El valor es: "+contador); 
            contador++;
        }
        while(contador<=n);
        
    }
}
