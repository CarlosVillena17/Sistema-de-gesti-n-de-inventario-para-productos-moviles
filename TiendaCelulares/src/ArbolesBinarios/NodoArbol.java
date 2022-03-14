
package ArbolesBinarios;
import Modelo.Producto;

public class NodoArbol {
    private Producto producto;
    private NodoArbol hijoIzquierdo;
    private NodoArbol hijoDerecho;
    public NodoArbol(Producto producto){
        this.producto=producto;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    @Override
    public String toString() {
        return producto.toString();
    }
}
