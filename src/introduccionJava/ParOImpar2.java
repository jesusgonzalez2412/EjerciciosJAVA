package introduccionJava;
import java.util.Scanner;
/**
 *Programa que determina si un numero es PAR o IMPAR
 * con la condicion if IN-LINE condicion ? retornoPorTrue : retornoPorFalse 
 * @author Jesús Glz
 */
public class ParOImpar2 {
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("In grese un valor numerico: ");
        int numero = leer.nextInt();
        
        // Realizamos la operacion para calcular el resto de dividir el num / 2
        int resto = numero%2;
        // Condición IF IN-LINE
        String mssg = (resto == 0)? "ES PAR": "ES IMPAR";
        
        //Muestra el resultado en consola
        System.out.println("El numero "+numero+" "+mssg);
    }
}
