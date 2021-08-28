package logica;
import IU.Interfaz;
import datos.AvenaConFruta;
import datos.Bebida;
import datos.Cerveza;
import datos.Comida;
import datos.Ensalada;
import datos.Fabricado;
import datos.Gaseosa;
import datos.Hamburguesa;
import datos.JugoDeFrutas;
import datos.NoVegano;
import datos.Pizza;
import datos.Prefabricado;
import datos.Productos;
import datos.Vegana;
public class Pueba {
    public static void main(String[] args){ 
        Interfaz.imprimirBienvenida ();
    //instanciacion hamburguesa
    Hamburguesa hamburguesa1 = new Hamburguesa("hamburguesa Ranchera",5000,true,null,false,500
    ,true,1,true,"res","normal",null);
    Hamburguesa hamburguesa2 = new Hamburguesa("hamburguesa Mexicana",5000,true,null,false,400
    ,true,1,true,"cerdo","Integral",null);
    Hamburguesa hamburguesa3 = new Hamburguesa();
    //intanciacion pizza
    Pizza pizza1 = new Pizza("pizza de champiñones",6000,true,null,true,450
    ,true,12,true,"normal","Queso","grande");
    Pizza pizza2 = new Pizza("pizza de carne",6000,true,null,true,650
    ,true,8,true,"Maiz","bocadillo","mediano");
    Pizza pizza3 = new Pizza();
    //intanciacion ensalada 
    Ensalada ensalada1 = new Ensalada("ensalada Italiana",5000,true,null,true,300,
    false,1,"salado",true,"Romana","roma");
    Ensalada ensalada2 = new Ensalada("ensalada detox",5000,true,null,true,300,
    false,1,"salado",false,"iceberg","cherry");
    Ensalada ensalada3 = new Ensalada();
    //instanciacion avena
    AvenaConFruta Avena1 = new AvenaConFruta("avena de frutos rojos",5000,true,null,false,400,
    false,1,"dulce",5,"roja",true);
    AvenaConFruta Avena2 = new AvenaConFruta("avena con banano",5000,true,null,false,400,
    true,1,"dulce",1,"Blanca",false);
    AvenaConFruta Avena3 = new AvenaConFruta();        

    
    Interfaz.imprimirInformacion();
    //escribir con teclado
    int opcion= Interfaz.leerTeclado();
    switch (opcion) {
        case 1:
            System.out.println("lista de Productos");
            System.out.println("No veganos");
            System.out.println("Hamburguesas");
            System.out.println(hamburguesa1.toString());
            System.out.println(hamburguesa2.toString());
            System.out.println(hamburguesa3.toString());
            System.out.println("Pizzas");
            System.out.println(pizza1.toString());
            System.out.println(pizza2.toString());
            System.out.println(pizza3.toString());
            System.out.println("Veganas");
            System.out.println("Ensaladas");
            System.out.println(ensalada1.toString());
            System.out.println(ensalada2.toString());
            System.out.println(ensalada3.toString());
            System.out.println("Avenas con fruta");
            System.out.println(Avena1.toString());
            System.out.println(Avena2.toString());
            System.out.println(Avena3.toString());
            break;
        case 14:
            System.out.println("lista de Productos");
            System.out.println("Hamburguesas");
            System.out.println(hamburguesa1.toString());
            System.out.println(hamburguesa2.toString());
            System.out.println(hamburguesa3.toString());
            break;
        case 2:
            System.out.println("Pizzas");
            System.out.println(pizza1.toString());
            System.out.println(pizza2.toString());
            System.out.println(pizza3.toString());
            break;
        case 3:
            System.out.println("Ensaladas");
            System.out.println(ensalada1.toString());
            System.out.println(ensalada2.toString());
            System.out.println(ensalada3.toString());
            break;
        case 4:
            System.out.println("Avenas con fruta");
            System.out.println(Avena1.toString());
            System.out.println(Avena2.toString());
            System.out.println(Avena3.toString());
            break;
        case 5:
            System.out.println(NotaJl.toString());
            System.out.println(NotaJn.toString());
            System.out.println(NotaSinId.toString());
            break;
        case 6:
            System.out.println(N1.toString());
            System.out.println(N2.toString());
            System.out.println(sinDefinir.toString());
            break;
        case 7:
            System.out.println(creditosJulieta.toString());
            System.out.println(creditosJuan.toString());
            System.out.println(creditosSinId.toString());
            break;
        default:
            System.out.println("ERROR");
            break;
    }
    


}

    }

    
}
