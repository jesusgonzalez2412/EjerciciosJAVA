package introduccionJava;
import java.util.Scanner;
/**
 *El siguiente programa pide al usuario que ingrese un valor entero e indique si
 * el valor ingresado es Par o Impar. Recordemos que número es para si es divisible
 * por 2. Es decir que el resto de dicha división debe ser cero.
 * @author Jesús Glz
 */
public class ParOImpar {
    public static void main (String[] args)
    {
        int numero=0, resto=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        numero = scanner.nextInt();
        //Obtenemos el resto de dividir el Numero entre 2
        resto = numero%2;
        if (resto==0)
            System.out.println("El numero: "+numero +" ES PAR !!");
        else
            System.out.println("El numero: "+numero +" ES IMPAR!!");
    }
    
}
