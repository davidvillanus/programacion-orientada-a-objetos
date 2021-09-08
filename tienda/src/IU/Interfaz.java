package IU;
import java.util.Scanner;


public class Interfaz {  
     public static void imprimirBienvenida () {
        System.out.println("Bienvenidos"); 
    }
    public static int leerTeclado (){
        Scanner lector=new Scanner(System.in);
        int num= lector.nextInt();
        //lector.close();
        return num;
        
        
    }
    
    public static void Indice(){
        System.out.println("1. Productos");
        System.out.println("2. Bebidas");
        System.out.println("3. seleccionados");
        System.out.println("0. Salir");
    }

        public static void Productos(){
            System.out.println("1. No vegetarianos");
            System.out.println("2. Vegetarianos");
            System.out.println("3. Retroceder");
            System.out.println("0. Salir");
        }

            public static void NoVeg(){
                System.out.println("1. Hamburguesa");
                System.out.println("2. Pizza");
                System.out.println("3. Retroceder");
                System.out.println("0. Salir");
            }
            public static void sel(){
                System.out.println("Selecciona la que quieras usando los numeros. Máximo 2");
                System.out.println("4. Retroceder");
                System.out.println("0. Salir");
            }
            public static void sel2(){
                System.out.println("Productos seleccionados");
                System.out.println("1. Ver lista");
                System.out.println("2. Retroceder");
                System.out.println("0. Salir");
            }
            
            public static void Veg(){
                System.out.println("1. Ensalada");
                System.out.println("2. Avena con fruta");
                System.out.println("3. Retroceder");
                System.out.println("0. Salir");
            }

        public static void Bebidas(){
            System.out.println("1. No artificiales");
            System.out.println("2. Artificiales");
            System.out.println("3. Retroceder");
            System.out.println("0. Salir");
            
        }

            public static void NoArt(){
                System.out.println("1. Jugos");
                System.out.println("2. Retroceder");
                System.out.println("0. Salir");
            }

            public static void Art(){
                System.out.println("1. Gaseosa");
                System.out.println("2. Cerveza");
                System.out.println("3. Retroceder");
                System.out.println("0. Salir");
            }
    
}

