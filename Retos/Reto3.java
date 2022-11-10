    package Retos;
    import java.util.Scanner;
    import java.util.Random;
    public class Reto3
    {        public static void main(String[] args) 
            {
                int eleccion;
                int moneda;
        
                Scanner lectura = new Scanner(System.in);
        
                Random Aleatorio = new Random();
        
                moneda = Aleatorio.nextInt((2));
                
                System.out.println("Eliga una opción: \n Cara = 0 \n Cruz = 1");
                eleccion = lectura.nextInt();
        
                if (eleccion==moneda) 
                {
                    System.out.println("------------------");
                    System.out.println(moneda + " Gano");
                } 
                else 
                {
                    System.out.println("------------------");
                    System.out.println(moneda +" Perdio");
                }
                lectura.close();
        
            }
    } 

