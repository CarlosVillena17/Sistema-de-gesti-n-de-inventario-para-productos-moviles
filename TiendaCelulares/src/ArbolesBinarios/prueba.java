
package ArbolesBinarios;

import Modelo.ClienteComprador;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.TreeSet;

public class prueba {
    public static void main(String[] args) {
        Producto p=new Producto("12300","acv",123,45);
        Producto p1=new Producto("1466","equisd",123,45);
        Producto p3=new Producto("9635","hola",123,45);
        Producto p2=new Producto("1456","villena",123,45);
        Producto p4=new Producto("4899","cortez",123,45);
        ArrayList<Producto> listainOrden=new ArrayList<>();
        ArbolBusquedaProducto arbol=new ArbolBusquedaProducto(listainOrden);
        arbol.agregarNodo(p);
        arbol.agregarNodo(p1);
        arbol.agregarNodo(p3);
        arbol.agregarNodo(p4);
        arbol.agregarNodo(p2);
        arbol.inOrden(arbol.getRaiz());
        arbol.mostrarInOrden();
        
        ClienteComprador d=new ClienteComprador("12300","mcv","mola","123", 45);
        ClienteComprador d1=new ClienteComprador("12300","ycv","yola","123", 45);
        ClienteComprador d2=new ClienteComprador("12300","tcv","tola","123", 45);
        ClienteComprador d3=new ClienteComprador("12300","ecv","eola","123", 45);
        ClienteComprador d4=new ClienteComprador("12300","rcv","rola","123", 45);
        
        System.out.println("----------------------------------------------------");
         ArrayList<ClienteComprador> listan=new ArrayList<>();
         ArbolBusquedaClientes clientes=new ArbolBusquedaClientes(listan);
         clientes.agregarNodo(d);
         clientes.agregarNodo(d1);
         clientes.agregarNodo(d2);
         clientes.agregarNodo(d3);
         clientes.agregarNodo(d4);
         clientes.inOrden(clientes.getRaiz());
         clientes.mostrarInOrden();
         
         
        
 
        
        

    }
}
