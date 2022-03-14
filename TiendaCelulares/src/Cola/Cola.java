
package Cola;

public class Cola<E> implements InterfazCola<E>{
    int size;
    NodoCola<E> head;
    NodoCola<E> tail;
    public Cola(){
        this.size=0;
        this.head=null;
        this.tail=null;
    }
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(this.size==0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public E front() {
        E elemento=null;
        if(isEmpty()){
            elemento=null;
        }else{
            elemento= this.head.getElemento();
        }
        return elemento;
    }

    @Override
    public E tail() {
        E elemento=null;
        if(isEmpty()){
            elemento=null;
        }else{
            elemento= this.tail.getElemento();
        }
        return elemento;
    }

    @Override
    public void enqueue(E elemento) {
        if(this.isEmpty()){
            NodoCola<E> nodo=new NodoCola<E>();
            nodo.setNext(null);
            nodo.setPrev(null);
            nodo.setElemento(elemento);
            this.head=nodo;
            this.tail=nodo;
            this.size=1;
        }else{
            NodoCola<E> nodo=new NodoCola<E>();
            nodo.setElemento(elemento);
            tail.setNext(nodo);
            nodo.setPrev(tail);
            nodo.setNext(null);
            this.tail=nodo;
            this.size++;
        }
    }

    @Override
    public boolean dequeue() {
        if(this.isEmpty()){
            return false;
        }else{
            this.head=head.getNext();
            this.size--;
            return true;
        }
    }
}
