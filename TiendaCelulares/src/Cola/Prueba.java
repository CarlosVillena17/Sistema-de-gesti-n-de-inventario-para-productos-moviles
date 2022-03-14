
package Cola;

public class Prueba {
    public static void main(String[] args) {
        Cola<String> cola=new Cola<String>();
        Cola<String> cola1=new Cola<String>();
        cola.enqueue("Cola1");
        cola.enqueue("Cola2");
        cola.enqueue("Cola3");
        cola.enqueue("Cola4");
        cola.enqueue("Cola5");
        int i=1;
        System.out.println("----------------------------");
        while (cola.isEmpty()==false){
            System.out.println(i+".-"+cola.front());
            i++;
            cola1.enqueue(cola.front());
            cola.dequeue();
        }
        cola=cola1;
        System.out.println("--------------------------");
        System.out.println(cola.front());

    }
}
