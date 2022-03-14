
package ArbolesBinarios;

import Modelo.Producto;
import java.util.ArrayList;

public class ArbolBusquedaProducto {
    NodoArbol raiz;
    ArrayList<Producto> listainOrden;
    ArrayList<Producto> listapreOrden;
    ArrayList<Producto> listapostOrden;

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
    public ArbolBusquedaProducto(ArrayList<Producto> listaInOrden){
        this.raiz=null;
        this.listainOrden=listaInOrden;
    }
    public ArbolBusquedaProducto(){
        this.raiz=null;
    }

    public ArrayList<Producto> getListainOrden() {
        return listainOrden;
    }

    public void setListainOrden(ArrayList<Producto> listainOrden) {
        this.listainOrden = listainOrden;
    }

    public ArrayList<Producto> getListapreOrden() {
        return listapreOrden;
    }

    public void setListapreOrden(ArrayList<Producto> listapreOrden) {
        this.listapreOrden = listapreOrden;
    }

    public ArrayList<Producto> getListapostOrden() {
        return listapostOrden;
    }

    public void setListapostOrden(ArrayList<Producto> listapostOrden) {
        this.listapostOrden = listapostOrden;
    }
    

    public void agregarNodo(Producto producto){
        NodoArbol nuevo=new NodoArbol(producto);
        if(raiz==null){
            this.raiz=nuevo;
        }else{
            NodoArbol temp=this.raiz;
            NodoArbol padre;
            while(true){
                padre=temp;
                if(producto.getNombre().charAt(0)<temp.getProducto().getNombre().charAt(0)){
                    temp=temp.getHijoIzquierdo();
                    if(temp==null){
                        padre.setHijoIzquierdo(nuevo);
                        return;
                    }
                }else{
                    temp=temp.getHijoDerecho();
                    if(temp==null){
                        padre.setHijoDerecho(nuevo);
                        return;
                    }
                }

            }
        }
    }

    public boolean isEmpty(){
        return this.raiz==null;
    }
    public void inOrden(NodoArbol r){
        if(r!=null){
            inOrden(r.getHijoIzquierdo());
            listainOrden.add(r.getProducto());
            inOrden(r.getHijoDerecho());
        }
    }
    public void preOrden(NodoArbol r){
        if(r!=null){
            listapreOrden.add(r.getProducto());
            preOrden(r.getHijoIzquierdo());
            preOrden(r.getHijoDerecho());
        }
    }
    public void postOrden(NodoArbol r){
        if(r!=null){
            postOrden(r.getHijoIzquierdo());
            postOrden(r.getHijoDerecho());
            listapostOrden.add(r.getProducto());
        }
    }
    public NodoArbol buscarNodo(String nombre){
        NodoArbol aux=raiz;
        while(!(aux.getProducto().getNombre().equals(nombre))){
            if(nombre.charAt(0)<aux.getProducto().getNombre().charAt(0)){
                aux=aux.getHijoIzquierdo();
            }else{
                aux=aux.getHijoDerecho();
            }
            if(aux==null){
                return null;
            }

        }
        return aux;
    }
    public boolean eliminar(String nombre){
        NodoArbol temp=this.raiz;
        NodoArbol padre=temp;
        boolean esHijoIzquierdo=false;
        while(!(nombre.equals(temp.getProducto().getNombre()))){

            padre=temp;
            if(nombre.charAt(0)< temp.getProducto().getNombre().charAt(0)){
                esHijoIzquierdo=true;
                temp=temp.getHijoIzquierdo();
            }else{
                esHijoIzquierdo=false;
                temp=temp.getHijoDerecho();
            }
            if(temp==null){
                return false;
            }
        }
        if(temp.getHijoIzquierdo()==null && temp.getHijoDerecho()==null){
            if(temp==this.raiz){
                this.raiz=null;
            }else if(esHijoIzquierdo){
                padre.setHijoIzquierdo(null);
            }else{
                padre.setHijoDerecho(null);
            }
        }else if(temp.getHijoDerecho()==null){
            if(temp==this.raiz){
                this.raiz=temp.getHijoIzquierdo();
            }else if(esHijoIzquierdo){
                padre.setHijoIzquierdo(temp.getHijoIzquierdo());
            }else{
                padre.setHijoDerecho(temp.getHijoIzquierdo());
            }
        }else if(temp.getHijoIzquierdo()==null){
            if(temp==this.raiz){
                this.raiz=temp.getHijoDerecho();
            }else if(esHijoIzquierdo){
                padre.setHijoIzquierdo(temp.getHijoDerecho());
            }else{
                padre.setHijoDerecho(temp.getHijoDerecho());
            }
        }else{
            NodoArbol reemplazo=obtenerNodoReemplazo(temp);
            if(temp==raiz){
                raiz=reemplazo;
            }else if(esHijoIzquierdo){
                padre.setHijoIzquierdo(reemplazo);
            }else{
                padre.setHijoDerecho(reemplazo);
            }
            reemplazo.setHijoIzquierdo(temp.getHijoIzquierdo());

        }
        return true;
    }
    public NodoArbol obtenerNodoReemplazo(NodoArbol temp){
        NodoArbol reemplazarPadre=temp;
        NodoArbol reemplazo=temp;
        NodoArbol auxiliar=temp.getHijoDerecho();
        while(auxiliar!=null){
            reemplazarPadre=reemplazo;
            reemplazo=auxiliar;
            auxiliar=auxiliar.getHijoIzquierdo();
        }
        if(reemplazo!=temp.getHijoDerecho()){
            reemplazarPadre.setHijoIzquierdo(reemplazo.getHijoDerecho());
            reemplazo.setHijoDerecho(temp.getHijoDerecho());
        }
        System.out.println("El nodo se reemplazo es : "+reemplazo);
        return reemplazo;
    }
    public void mostrarInOrden(){
        for(Producto i: listainOrden){
            System.out.println(i);
        }
    }
    
}
