    package Retos;
    import java.util.Scanner;
    import java.util.Random;
    public class Reto4
    {
        
            public static void main (String[] args)
            {
                int Eleccion;
                int juego;
        
                Scanner lectura = new Scanner(System.in);
                Random aleatorio = new Random();
        
                System.out.println("Escriba 1 para PIEDRA, 2 para PAPEL o 3 para TIJERA ");
                Eleccion = lectura.nextInt();
        
                System.out.println("El sistema esta elijiendo ");
                juego = (int) (Math.aleatorio() *3) + 1;
        
               
                if (juego == 1 )
                {
                    if(juego == 1 && Eleccion==1 )
                    {
                        System.out.println("Salio PIEDRA por lo tanto es EMPATE");
                    }
                    else if (juego == 1 && Eleccion == 2)
                    {
                        System.out.println(" Salio PIEDRA por lo tanto GANO");
                    }
                    else if (juego == 1 && Eleccion == 3)
                    {
                        System.out.println(" Salio PIEDRA por lo tanto PERDIO");
                    }
                }
                
                else if (juego==2 )
                {
                    if(juego == 2 && Eleccion==2 )
                    {
                        System.out.println("Salio PAPEL por lo tanto es EMPATE");
                    }
                    else if (juego == 2 && Eleccion == 3)
                    {
                        System.out.println(" Salio PAPEL por lo tanto GANO");
                    }
                    else if (juego == 2 && Eleccion == 1)
                    {
                        System.out.println(" Salio PAPEL por lo tanto PERDIO");
                    }
                }
                else if (juego==3 )
                {
                    if(juego == 3 && Eleccion == 3 )
                    {
                        System.out.println("Salio TIJERA por lo tanto es EMPATE");
                    }
                    else if (juego == 3 && Eleccion == 1)
                    {
                        System.out.println(" Salio TIJERA por lo tanto GANO");
                    }
                    else if (juego == 3 && Eleccion == 2)
                    {
                        System.out.println(" Salio TIJERA por lo tanto PERDIO");
                    }
                }
            
        }
    }


