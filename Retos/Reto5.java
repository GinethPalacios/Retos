    package Retos;
    import java.util.Scanner;
    public class Reto5 
    {

        public static void main(String[] args)
        
        {
        int Productos;
        int Precio;
        int Total =0;
        int P;

            Scanner lectura = new Scanner (System.in);

            System.out.println("Ingrese la cantidad de productos que necesita");
            Productos = lectura.nextInt();

            for(P=0;P<Productos;P++)
            {
                System.out.println("Ingrese el precio del producto");
                Precio = lectura.nextInt();
                
                Total = Precio + Total;
            }
            System.out.println("El total de su compra es: "+ Total);

            lectura.close();
        }

    }
