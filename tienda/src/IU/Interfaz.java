package IU;
import java.util.Scanner;


public class Interfaz {  
     public static void imprimirBienvenida () {
        System.out.println("Bienvenidos"); 
    }
    public static int leerTeclado (){
        Scanner lector=new Scanner(System.in);
        int num= lector.nextInt();
        lector.close();
        return num;
        
        
    }
    
    public static void imprimirInformacion(){
        System.out.println("Precione 1 para visualizar la lista con todos los productos");
        System.out.println("Precione 2 para visualizar la lista de todas las bebidas");
        System.out.println("Precione 3 para visualizar la lista de bebidas fabricadas ");
        System.out.println("Precione 4 para visualizar la lista de bebidas prefabricadas ");
        System.out.println("Precione 5 para visualizar la lista de todas las comidas ");
        System.out.println("Precione 6 para visualizar la lista de comidas veganas ");
        System.out.println("Precione 7 para visualizar la lista de comidas no veganas ");
        System.out.println("Precione 8 para visualizar la lista de Jugos de Fruta ");
        System.out.println("Precione 9 para visualizar la lista de gaseosas ");
        System.out.println("Precione 10 para visualizar la lista de cervezas ");
        System.out.println("Precione 11 para visualizar la lista de hamburguesas ");
        System.out.println("Precione 12 para visualizar la lista de pizzas ");
        System.out.println("Precione 13 para visualizar la lista de ensaladas ");
        System.out.println("Precione 15 para visualizar la lista de avenas con Fruta ");
        System.out.println("Precione 0 para salir");
    }
    
}

