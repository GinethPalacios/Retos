package Retos;
import java.util.Scanner;

public class Reto8 
{
    public static void main(String[] args) 
    {
       int Competidor;

        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese cuantos competidores participaran");
        Competidor = lectura.nextInt();

        String [] Nombrecom  = new String [Competidor];

        int [] Tiempocom = new int [Competidor];

        for(int C=0;C<Nombrecom.length;C++) 
        {
            System.out.println("Ingrese el nombre del competidor");
            Nombrecom [C] = lectura.next();

            System.out.println("Ingrese el tiempo del competidor");
            Tiempocom [C] = lectura.nextInt();
        }
        for (int C=0;C<Nombrecom.length;C++)
        {
            System.out.println("El nombre del competidor es"+ Nombrecom [C]);
            System.out.println("El tiempodelcompetidor es"+ Tiempocom [C]);
        }

        
    }
}
 
        