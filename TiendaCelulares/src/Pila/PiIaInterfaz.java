
package Pila;

public interface PiIaInterfaz<E> {
    public void push(E elemento);
    public boolean pop();
    public int size();
    public boolean isEmpty();
    public E top();
}
