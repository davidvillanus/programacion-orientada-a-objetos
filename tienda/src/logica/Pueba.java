package logica;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
    Pizza pizza1 = new Pizza("pizza de champi�ones",6000,true,null,true,450
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
    
    //instanciacion gaseosa
    Gaseosa gaseosa1 = new Gaseosa("CocaCola",3000,true,0,"grande",300,"CocaCola inc","botella",true,500,2,"soda");
    Gaseosa gaseosa2 = new Gaseosa("Colombiana",2000,false,0,"mediano",300,"Postobon","botella",true,200,1,"cola");
    Gaseosa gaseosa3 = new Gaseosa();
    
    //instanciacion cerveza
    Cerveza cerveza1 = new Cerveza("aguila",2000,true,0,"mediano",400,"Bavaria","lata",true,200,2,true);
    Cerveza cerveza2 = new Cerveza("poker",2000,true,0,"mediano",400,"Bavaria","botella",true,200,2,false);
    Cerveza cerveza3 = new Cerveza();
      
    //instanciacion jugo
    JugoDeFrutas jugo1 = new JugoDeFrutas("jugo de lulo",2000,true,5,"grande",200,"dulce",true,false,true,"azucar",false);
    JugoDeFrutas jugo2 = new JugoDeFrutas("jugo de mora",2000,true,5,"grande",200,"dulce",true,true,true,"panela",true);
    JugoDeFrutas jugo3 = new JugoDeFrutas();

    ArrayList<AvenaConFruta> avenaList = new ArrayList<AvenaConFruta>();
    avenaList.add(Avena1);
    avenaList.add(Avena2);
    avenaList.add(Avena3);

    ArrayList<Ensalada > EnsaladaList = new ArrayList<Ensalada >();
    EnsaladaList.add(ensalada1);
    EnsaladaList.add(ensalada2);
    EnsaladaList.add(ensalada3);

    ArrayList<JugoDeFrutas> jugoList = new ArrayList<JugoDeFrutas>();
    jugoList.add(jugo1);
    jugoList.add(jugo2);
    jugoList.add(jugo3);
 
    HashMap<String,Hamburguesa>HamburguesaList =new HashMap<String,Hamburguesa>();
    HamburguesaList.put("h1",hamburguesa1);
    HamburguesaList.put("h2",hamburguesa2);
    HamburguesaList.put("h3",hamburguesa3);

    HashMap<String,Pizza>PizzaList =new HashMap<String,Pizza>();
    PizzaList.put("P1",pizza1);
    PizzaList.put("P2",pizza2);
    PizzaList.put("P3",pizza3);

    HashSet<Gaseosa> gaseosaList = new HashSet<Gaseosa>();
    gaseosaList.add(gaseosa1);
    gaseosaList.add(gaseosa2);
    gaseosaList.add(gaseosa3);

    HashSet<Cerveza> cervezaList = new HashSet<Cerveza>();
    cervezaList.add(cerveza1);
    cervezaList.add(cerveza2);
    cervezaList.add(cerveza3);

    boolean salir = false;
    
   
    while(!salir){

        Interfaz.Indice();
        int indice = Interfaz.leerTeclado();
        switch (indice) {
            case 1:
                boolean salir2 = false;
                while(!salir2){
                    Interfaz.Productos();
                    int producto = Interfaz.leerTeclado();
                    switch (producto) {
                        case 1:
                            boolean salir4 = false;
                            while (!salir4){
                                Interfaz.NoVeg();
                                int NoVeg = Interfaz.leerTeclado();
                                switch (NoVeg) {
                                    case 1:
                                        System.out.println("Hamburguesas: ");
                                        System.out.println(hamburguesa1.toString());
                                        System.out.println(hamburguesa2.toString());
                                        System.out.println(hamburguesa3.toString());
                                    break;
                                    case 2:
                                        System.out.println("Pizzas: ");
                                        System.out.println(pizza1.toString());
                                        System.out.println(pizza2.toString());
                                        System.out.println(pizza3.toString());
                                    break;
                                    case 3:
                                        salir4 = true;
                                    break;
                                    case 0:
                                        System.out.println("Hasta luego!");
                                        salir4 = true;
                                        salir2 = true;
                                        salir = true;
                                    break;
                                    default:
                                        System.out.println("ERROR");
                                    break;
                                }
                            }
                        break;
                        case 2:
                            boolean salir5 = false;
                            while (!salir5) {
                                Interfaz.Veg();
                                int Veg = Interfaz.leerTeclado();
                                switch (Veg) {
                                    case 1:
                                        System.out.println("Ensalada Cob: ");
                                        System.out.println(ensalada1.toString());
                                        System.out.println(ensalada2.toString());
                                        System.out.println(ensalada3.toString());
                                    break;
                                    case 2:
                                        salir5 = true;
                                    break;
                                    case 0:
                                        System.out.println("Hasta luego!");
                                        salir5 = true;
                                        salir2 = true;
                                        salir = true;
                                    break;
                                    default:
                                        System.out.println("ERROR");
                                    break;
                                }
                            }
                        break;
                        case 3:
                            salir2 = true;
                        break;
                        case 0:
                            System.out.println("Hasta luego!");
                            salir2 = true;
                            salir = true;
                        break;
                        default:
                        System.out.println("ERROR");
                        break;
                    }
                }
            break;
            case 2:
                boolean salir3 = false;
                while (!salir3){
                    Interfaz.Bebidas();
                    int bebida = Interfaz.leerTeclado();
                    switch (bebida) {
                        case 1:
                            boolean salir6 = false;
                            while (!salir6){
                                Interfaz.NoArt();
                                int NoArt = Interfaz.leerTeclado();
                                switch (NoArt) {
                                    case 1:
                                        System.out.println("Avena con frutas: ");
                                        System.out.println(Avena1.toString());
                                        System.out.println(Avena2.toString());
                                        System.out.println(Avena3.toString());
                                    break;
                                    case 2:
                                        System.out.println("Jugos: ");
                                        System.out.println(jugo1.toString());
                                        System.out.println(jugo2.toString());
                                        System.out.println(jugo3.toString());
                                    break;
                                    case 3:
                                        salir6 = true;
                                    break;
                                    case 0:
                                        System.out.println("Hasta luego!");
                                        salir6 = true;
                                        salir3 = true;
                                        salir = true;
                                    break;
                                    default:
                                        System.out.println("ERROR");
                                    break;
                                }
                            }
                        break;
                        case 2:
                            boolean salir7 = false;
                            while (!salir7){
                                Interfaz.Art();
                                int Art = Interfaz.leerTeclado();
                                switch (Art) {
                                    case 1:
                                        System.out.println("Gaseosas: ");
                                        System.out.println(gaseosa1.toString());
                                        System.out.println(gaseosa2.toString());
                                        System.out.println(gaseosa3.toString());
                                    break;
                                    case 2:
                                        System.out.println("Cervezas: ");
                                        System.out.println(cerveza1.toString());
                                        System.out.println(cerveza2.toString());
                                        System.out.println(cerveza3.toString());
                                    break;
                                    case 3:
                                        salir7 = true;
                                    break;
                                    case 0:
                                        System.out.println("Hasta luego!");
                                        salir7 = true;
                                        salir3 = true;
                                        salir = true;
                                    break;
                                    default:
                                        System.out.println("ERROR");
                                    break;
                                }
                            }
                        break;
                        case 3:
                            salir3 = true;
                        break;
                        case 0:
                            System.out.println("Hasta luego!");
                            salir3 = true;
                            salir = true;
                        break;
                        default:
                            System.out.println("ERROR");
                        break;
                    }
                }
            break;
            case 0:
                System.out.println("Hasta luego!");
                salir = true;
            break;
            default:
                System.out.println("ERROR");
            break;
        }

    }

    



    }
}

    

