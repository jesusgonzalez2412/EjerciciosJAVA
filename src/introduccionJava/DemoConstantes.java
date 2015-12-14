
package introduccionJava;
import java.util.Scanner;
/**
 *Programa que muestra los días de la semana (Utilizando constantes)
 * @author Jesús Glz. <jesusgonzalez2412@gmail.com>
 */
public class DemoConstantes {
    //Definimos las constantes
    public static final int LUNES = 1;
    public static final int MARTES = 2;
    public static final int MIERCOLES = 3;
    public static final int JUEVES = 4;
    public static final int VIERNES = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO = 7;
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana (numero): ");
        int valor = scanner.nextInt() ;
        String dia ="";
        
        switch (valor)
        {
            case LUNES:
                dia="LUNES";
                break;
            case MARTES:
                dia = "MARTES";
                break;
            case MIERCOLES:
                dia = "MIERCOLES";
                break;
            case JUEVES:
                dia = "JUEVES";
                break;
            case  VIERNES:
                dia = "VIERNES";
                break;
            case SABADO:
                dia = "SABADO";
                break;
            case DOMINGO:
                dia = "DOMINGO";
                break;
            default:
                 dia = "Valor incorrecto... El valo debe ser entre 1 y 7.";
        }//Fin Switch
        System.out.println("Ingreso el numero: "+valor+" Corresponde al dia: "+dia);
    }
    
}
