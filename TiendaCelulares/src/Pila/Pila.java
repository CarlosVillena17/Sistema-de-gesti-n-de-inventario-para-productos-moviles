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
public class Pila<E> implements PiIaInterfaz<E>{
    int size;
    Nodoo<E> cima;
    public Pila(){
        size=0;
        cima=null;
    }
    @Override
    public void push(E elemento) {
        if(isEmpty()){
            Nodoo<E> nodo=new Nodoo<E>();
            nodo.setElemento(elemento);
            nodo.setPrev(null);
            cima=nodo;
            this.size=1;
        }else{
            Nodoo<E> nodo=new Nodoo<E>();
            nodo.setElemento(elemento);
            nodo.setPrev(cima);
            cima=nodo;
            this.size++;

        }
    }

    @Override
    public boolean pop() {
        if(isEmpty()){
            return false;
        }else{
            this.cima= cima.getPrev();
            this.size--;
            return true;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(this.size==0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public E top() {
        E elemento=null;
        if(isEmpty()){
            elemento=null;
        }else{
            elemento=cima.getElemento();
        }
        return elemento;
    }
}
