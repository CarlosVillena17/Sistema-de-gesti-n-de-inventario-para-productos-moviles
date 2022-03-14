
package Cola;

public class NodoCola<E> {
    E elemento;
    NodoCola<E> prev;
    NodoCola<E> next;
    public NodoCola(){
        elemento=null;
        prev=null;
        next=null;
    }
    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public NodoCola<E> getPrev() {
        return prev;
    }

    public void setPrev(NodoCola<E> prev) {
        this.prev = prev;
    }

    public NodoCola<E> getNext() {
        return next;
    }

    public void setNext(NodoCola<E> next) {
        this.next = next;
    }
}
