
package Ordenamiento;

import Modelo.Producto;
import java.util.ArrayList;

public class ControladorProductos {
    ArrayList<Producto> lista;

    public ControladorProductos(ArrayList<Producto> lista) {
        this.lista = lista;
    }
    public ControladorProductos(){
        
    }
    
    public static void quickSortCantidad(ArrayList<Producto> a, int izq, int der){
        int i, j, pivote;
        Producto aux;
        i=izq;
        j=der;
        pivote=a.get((izq+der)/2).getCantidad();
        while(i<=j){
            while(a.get(i).getCantidad()<pivote){
                i++;
            }
            while(a.get(j).getCantidad()>pivote){
                j--;
            }
            if(i<=j){
                aux=a.get(i);
                a.set(i, a.get(j));
                a.set(j, aux);
                i++;
                j--;
            }
        }
        if(izq<j){
            quickSortCantidad(a, izq, j);
        }
        if(i<der){
            quickSortCantidad(a, i,der);
        }
    }
    
    public static void ordenacionMonticulosPrecios(ArrayList<Producto> v) {

        final int N = v.size();
        for(int nodo = N/2; nodo>=0; nodo--)
            hacerMonticulo(v, nodo, N-1);
        for(int nodo = N-1; nodo>=0; nodo--) {
            Producto tmp = v.get(0);
            v.set(0, v.get(nodo));
            v.set(nodo, tmp);
            hacerMonticulo(v, 0, nodo-1);
        }
    }

    public static void hacerMonticulo(ArrayList<Producto> v, int nodo, int fin) {
        int izq = 2*nodo+1;
        int der = izq+1;
        int may;
        if(izq>fin) return;
        if(der>fin) may=izq;
        else may= v.get(izq).getPrecio()>v.get(der).getPrecio()?izq:der;
        if(v.get(nodo).getPrecio() < v.get(may).getPrecio()) {
            Producto tmp = v.get(nodo);
            v.set(nodo, v.get(may));
            v.set(may, tmp);
            hacerMonticulo(v, may, fin);
        }
    }
    
    
    public static void main(String[] args) {
        ArrayList<Producto> lista=new ArrayList<>();
        lista.add(new Producto("ola1", "Carlos", 50,10));
        lista.add(new Producto("la1", "Abanto", 10,60));
        lista.add(new Producto("a1", "Flavia", 30,620));
        lista.add(new Producto("aola1", "Suarez", 60,25));
        lista.add(new Producto("wola1", "Cornejo", 550,29));
        lista.add(new Producto("Hola1", "Equisde", 90,266));
        lista.add(new Producto("Hola1", "MariLuz", 610,10));
        lista.add(new Producto("Hola1", "Andres", 150,23));
        
    }
    
     
    
}
