/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolesBinarios;

import Modelo.ClienteComprador;

/**
 *
 * @author Usuario
 */
public class NodoArbolCliente {
    private ClienteComprador cliente;
    private NodoArbolCliente hijoIzquierdo;
    private NodoArbolCliente hijoDerecho;
    public NodoArbolCliente(ClienteComprador cliente){
        this.cliente=cliente;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
    }

    public ClienteComprador getCliente() {
        return cliente;
    }

    public void setCliente(ClienteComprador cliente) {
        this.cliente = cliente;
    }

    public NodoArbolCliente getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbolCliente hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbolCliente getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbolCliente hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    @Override
    public String toString() {
        return cliente.toString();
    }

    
}
