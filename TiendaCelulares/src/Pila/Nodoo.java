/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 *
 * @author Usuario
 */
public class Nodoo<E> {
     E elemento;
    Nodoo<E> prev;
    public Nodoo(){
        elemento=null;
        prev=null;
    }
    public E getElemento() {
        return elemento;
    }
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }
    public Nodoo<E> getPrev() {
        return prev;
    }
    public void setPrev(Nodoo<E> prev) {
        this.prev = prev;
    }
}
