package Retos;
import java.util.Scanner;
public class Reto9 
{
   public static void main(String[] args) 
 {
    String [] [] productos = new String [4] [4];
    int [] [] precio = new int [4] [4];

    Scanner lectura = new Scanner (System.in);

for(int fila=0;fila<4;fila++)
{
    for(int columna=0;columna<4;columna++)
    {
        System.out.println("Ingrese el producto"      );
        productos[fila][columna] = lectura.next();

        System.out.println("Ingrese el precio del producto"  );
        precio[fila][columna] = lectura.nextInt();
    }
   
}   
for(int fila=0;fila<4;fila++) 
{
    for(int columna=0;columna<4;columna++)
    {
      System.out.println(fila+""+columna+productos [fila][columna] + precio[fila][columna]+ "\t");
    }
}  
lectura.close();  
  }
}