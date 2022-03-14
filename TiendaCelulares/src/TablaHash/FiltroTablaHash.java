
package TablaHash;

import Modelo.Producto;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class FiltroTablaHash {
    Hashtable<String, LinkedList<Producto>> tabla=new Hashtable<String, LinkedList<Producto>>();
    public void pasarTabla(ArrayList<Producto> p){
        for(Producto prod: p){
            LinkedList<Producto> lista=tabla.get(prod.getCodigo());
            if(lista==null){
                lista=new LinkedList<Producto>();
                lista.add(prod);
                tabla.put(prod.getCodigo(),lista);
            }else{
                lista.add(prod);
                tabla.put(prod.getCodigo(),lista);
            }
        }
    }
    public ArrayList<Producto> filtrarPorCodigo(String filtro){
        LinkedList<Producto> lista=tabla.get(filtro);
        Iterator<Producto> i=lista.iterator();
        ArrayList<Producto> listaconfiltro=new ArrayList<Producto>();
        while(i.hasNext()){
            listaconfiltro.add(i.next());
            
        }
        return listaconfiltro;
    }
}
