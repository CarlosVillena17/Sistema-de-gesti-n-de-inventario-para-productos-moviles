
package ArbolesBinarios;

import Modelo.ClienteComprador;
import java.util.ArrayList;


public class ArbolBusquedaClientes {
     NodoArbolCliente raiz;
    ArrayList<ClienteComprador> listainOrden;
    ArrayList<ClienteComprador> listapreOrden;
    ArrayList<ClienteComprador> listapostOrden;

    public NodoArbolCliente getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbolCliente raiz) {
        this.raiz = raiz;
    }
    public ArbolBusquedaClientes(ArrayList<ClienteComprador> listaInOrden){
        this.raiz=null;
        this.listainOrden=listaInOrden;
    }
    public ArbolBusquedaClientes(){
        this.raiz=null;
    }

    public ArrayList<ClienteComprador> getListainOrden() {
        return listainOrden;
    }

    public void setListainOrden(ArrayList<ClienteComprador> listainOrden) {
        this.listainOrden = listainOrden;
    }

    public ArrayList<ClienteComprador> getListapreOrden() {
        return listapreOrden;
    }

    public void setListapreOrden(ArrayList<ClienteComprador> listapreOrden) {
        this.listapreOrden = listapreOrden;
    }

    public ArrayList<ClienteComprador> getListapostOrden() {
        return listapostOrden;
    }

    public void setListapostOrden(ArrayList<ClienteComprador> listapostOrden) {
        this.listapostOrden = listapostOrden;
    }
    

    public void agregarNodo(ClienteComprador cliente){
        NodoArbolCliente nuevo=new NodoArbolCliente(cliente);
        if(raiz==null){
            this.raiz=nuevo;
        }else{
            NodoArbolCliente temp=this.raiz;
            NodoArbolCliente padre;
            while(true){
                padre=temp;
                if(cliente.getNombre().charAt(0)<temp.getCliente().getNombre().charAt(0)){
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
    public void inOrden(NodoArbolCliente r){
        if(r!=null){
            inOrden(r.getHijoIzquierdo());
            listainOrden.add(r.getCliente());
            inOrden(r.getHijoDerecho());
        }
    }
    public void preOrden(NodoArbolCliente r){
        if(r!=null){
            listapreOrden.add(r.getCliente());
            preOrden(r.getHijoIzquierdo());
            preOrden(r.getHijoDerecho());
        }
    }
    public void postOrden(NodoArbolCliente r){
        if(r!=null){
            postOrden(r.getHijoIzquierdo());
            postOrden(r.getHijoDerecho());
            listapostOrden.add(r.getCliente());
        }
    }
    public NodoArbolCliente buscarNodo(String nombre){
        NodoArbolCliente aux=raiz;
        while(!(aux.getCliente().getNombre().equals(nombre))){
            if(nombre.charAt(0)<aux.getCliente().getNombre().charAt(0)){
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
        NodoArbolCliente temp=this.raiz;
        NodoArbolCliente padre=temp;
        boolean esHijoIzquierdo=false;
        while(!(nombre.equals(temp.getCliente().getNombre()))){

            padre=temp;
            if(nombre.charAt(0)< temp.getCliente().getNombre().charAt(0)){
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
            NodoArbolCliente reemplazo=obtenerNodoReemplazo(temp);
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
    public NodoArbolCliente obtenerNodoReemplazo(NodoArbolCliente temp){
        NodoArbolCliente reemplazarPadre=temp;
        NodoArbolCliente reemplazo=temp;
        NodoArbolCliente auxiliar=temp.getHijoDerecho();
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
        for(ClienteComprador i: listainOrden){
            System.out.println(i);
        }
    }
    public void mostrarPreOrden(){
        for(ClienteComprador i: listapreOrden){
            System.out.println(i);
        }
    }
    public void mostrarPostOrden(){
        for(ClienteComprador i: listapostOrden){
            System.out.println(i);
        }
    }
}
