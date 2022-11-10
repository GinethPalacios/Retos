  package Retos;
import java.util.Scanner;

public class Reto7
{
    public static void main(String[] args)
    {
        
        double promedio;
        int cantidad =0;
        int Dato =0;
        

        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de notas del estudiante");
        Dato = lectura.nextInt();
        
        int [] Nota = new int [Dato];

        for(int N=0;N<Nota.length;N++) 
        {
            System.out.println("Ingrese las notas del estudiante");
            Nota [N] = lectura.nextInt();
            cantidad = cantidad + Nota [N];
        }
        promedio = cantidad / Nota.length;

        if (promedio <3.0)
        {
            System.out.println("Reprobaste");
        }
        else if(promedio >3.0 && promedio<4.0) 
        {
            System.out.println("Pasaste raspando");
        }
        else 
        {
            System.out.println("Aprobaste con buenos resultados");
        }
        

 lectura.close();
    }
}
