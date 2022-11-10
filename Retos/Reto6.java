    package Retos;
    import java.util.Scanner;
    import java.util.Random;
    public class Reto6 
{
        public static void main(String[] args)
    {
                int eleccion;
                int moneda;
                int Total = 0;
                int Cantidaddinero = 0;
                int Repetir = 0;
        
                try (Scanner lectura = new Scanner(System.in)) 
                {
                    System.out.println("Ingrese el valor que quiere apostar");
                    Cantidaddinero = lectura.nextInt();


      while(Repetir == 0)
      {
         Random Aleatorio = new Random();
         moneda = Aleatorio.nextInt((2-1)+1)+1;
        
         System.out.println("Eliga una opción: \n Cara = 1 \n Cruz = 2");
         eleccion = lectura.nextInt();
         
         if (eleccion==moneda) 
         {
                    System.out.println("------------------");
                    System.out.println(moneda + " Gano");
                    Total = Cantidaddinero + 100;

                    
         } 
         else 
         {
                    System.out.println("------------------");
                    System.out.println(moneda +" Perdio");
                    Total = Cantidaddinero - 100;
         }
         
         System.out.println("Ingrese 0 si quiere seguir jugando");
         System.out.println("Ingrese 1 si quiere salir del juego");
         Repetir = lectura.nextInt();

        }
                }



    }

    
}
    
