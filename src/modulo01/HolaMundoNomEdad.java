
package modulo01;

import java.util.Scanner;

/**
 *Programa que pide nombre, edad y altura
 * @author Jesús Glz
 */
public class HolaMundoNomEdad {
    public static void main (String[] args)
    {
        String nombre="";
        int edad=0;
        double altura=0.0;
        Scanner scanner = new Scanner (System.in);
        //Mensajes para el usuario
        System.out.println("Ingrese nombre, edad y altura:");
        //Lee el nombre por teclado
        nombre = scanner.next();
        edad = scanner.nextInt();
        altura = scanner.nextDouble();
        //Mostrar los datos por consola
        System.out.println("Nombre: "+nombre+" Edad: "+" Altura: "+altura);
    }
    
}
