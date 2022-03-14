/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

/**
 *
 * @author Usuario
 */
public interface InterfazCola<E> {
    public int size();
    public boolean isEmpty();
    public E front();
    public E tail();
    public void enqueue(E elemento);
    public boolean dequeue(); 
}
