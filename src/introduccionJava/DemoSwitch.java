package introduccionJava;
import java.util.Scanner;
/**
 * Estructura Switch. Programa que pide al usuario que ingrese un dia de la semana (entre 1 y 7) y
 * motrara el nombre del día 
 * @author Jesús Glz
 */
public class DemoSwitch {
    public static void main (String[] args)
    {
        int numero= 0;
        String dia ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dia de la seman (numero): ");
        numero= scanner.nextInt();
        
        switch(numero)
        {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Valor incorrecto... El valo debe ser entre 1 y 7.";                             
        }
        System.out.println("Ingresaste el numero: "+numero+" Corresponde al dia: "+dia);
    }
    
}
