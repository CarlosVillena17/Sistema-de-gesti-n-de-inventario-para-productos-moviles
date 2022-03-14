
package Ordenamiento;


import Modelo.ClienteComprador;
import java.util.ArrayList;

public class ControladorClientes {
    ArrayList<ClienteComprador> lista;

    public ControladorClientes(ArrayList<ClienteComprador> lista) {
        this.lista = lista;
    }
    public ControladorClientes(){
        
    }
    public static void quickSortVentas(ArrayList<ClienteComprador> a, int izq, int der){
        int i, j;
        double pivote;
        ClienteComprador aux;
        i=izq;
        j=der;
        pivote=a.get((izq+der)/2).getVentas();
        while(i<=j){
            while(a.get(i).getVentas()<pivote){
                i++;
            }
            while(a.get(j).getVentas()>pivote){
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
            quickSortVentas(a, izq, j);
        }
        if(i<der){
            quickSortVentas(a, i,der);
        }
    }
    public static void main(String[] args) {
        ArrayList<ClienteComprador> lista=new ArrayList<>();
        lista.add(new ClienteComprador("ola1", "Carlos", "12365", "488", 10));
        lista.add(new ClienteComprador("ola1", "Carlos", "12365", "488", 12));
        lista.add(new ClienteComprador("ola1", "Carlos", "12365", "488", 1));
        lista.add(new ClienteComprador("ola1", "Carlos", "12365", "488", 23));
        lista.add(new ClienteComprador("ola1", "Carlos", "12365", "488", 60));
        lista.add(new ClienteComprador("ola1", "Carlos", "12365", "488", 105));
        ControladorClientes.quickSortVentas(lista, 0, lista.size()-1);
        for(ClienteComprador cliente: lista){
            System.out.println(cliente);
        }
    }
    
    
}
