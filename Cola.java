public class Cola<T> {
    private LinkedList<T> list;

    public Cola() {
        list = new LinkedList<>(false, false);
    }

    public void enqueue(T item) {
        list.insert(item);
    }

    public T dequeue() {
        return list.removeFirst();
    }

    public T peek() {
        return list.peekFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
