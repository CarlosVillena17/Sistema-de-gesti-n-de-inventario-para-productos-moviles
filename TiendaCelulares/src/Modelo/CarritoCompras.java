
package Modelo;

import java.util.LinkedList;

public class CarritoCompras {
    private LinkedList<Producto> listaproductos;
    private float precioTotal; 

    public LinkedList<Producto> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(LinkedList<Producto> listaproductos) {
        this.listaproductos = listaproductos;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
    
}
