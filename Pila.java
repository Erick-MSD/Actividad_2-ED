public class Pila<T> {
    private LinkedList<T> list;

    public Pila() {
        // usar lista simplemente enlazada (no doble, no circular)
        list = new LinkedList<>(false, false);
    }

    public void push(T item) {
        list.insertAtHead(item);
    }

    public T pop() {
        return list.removeFirst();
    }

    public T peek() {
        return list.peekFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
