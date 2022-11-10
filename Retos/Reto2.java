package Retos;
import java.util.Scanner;
public class Reto2
{
    public static void main(String[] args) 
    {
        int Edad;
        int Peso;
        int Dosis;

        Scanner lectura = new Scanner ( System.in); 
        {
            System.out.println("Ingrese el peso del bebe");
            Peso = lectura.nextInt();

            System.out.println("Ingrese la edad del bebe");
            Edad = lectura.nextInt();
        }
        Dosis =(Peso+10)/(Edad*10)*8;

        System.out.println("Resultado:"+Dosis);
        
        lectura.close();
    }
  
    
}
