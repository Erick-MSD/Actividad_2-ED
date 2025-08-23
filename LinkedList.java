public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private boolean isDoubly;
    private boolean isCircular;

    public LinkedList(boolean isDoubly, boolean isCircular) {
        this.head = null;
        this.tail = null;
        this.isDoubly = isDoubly;
        this.isCircular = isCircular;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            if (isCircular) {
                head.next = head;
                if (isDoubly) head.prev = head;
            }
            return;
        }

        tail.next = newNode;
        if (isDoubly) newNode.prev = tail;
        tail = newNode;

        if (isCircular) {
            tail.next = head;
            if (isDoubly) head.prev = tail;
        }
    }

    public boolean delete(T data) {
        if (head == null) return false;

        Node<T> current = head;
        Node<T> prevNode = null;

        do {
            if (current.data.equals(data)) {
                if (current == head) {
                    head = head.next;
                    if (isDoubly && head != null) head.prev = tail;
                    if (isCircular && tail != null) tail.next = head;
                } else {
                    prevNode.next = current.next;
                    if (isDoubly && current.next != null) {
                        current.next.prev = prevNode;
                    }
                    if (current == tail) {
                        tail = prevNode;
                        if (isCircular) tail.next = head;
                    }
                }
                if (head == null) tail = null;
                return true;
            }
            prevNode = current;
            current = current.next;
        } while (isCircular ? current != head : current != null);

        return false;
    }

    public boolean search(T data) {
        if (head == null) return false;
        Node<T> current = head;
        do {
            if (current.data.equals(data)) return true;
            current = current.next;
        } while (isCircular ? current != head : current != null);
        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("Lista vacía.");
            return;
        }
        Node<T> current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (isCircular ? current != head : current != null);
        System.out.println(isCircular ? "(regresa a inicio)" : "null");
    }

    // --- Helper methods for stack/queue operations ---
    public void insertAtHead(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            if (isCircular) {
                head.next = head;
                if (isDoubly) head.prev = head;
            }
            return;
        }

        newNode.next = head;
        if (isDoubly) head.prev = newNode;
        head = newNode;

        if (isCircular) {
            tail.next = head;
            if (isDoubly) head.prev = tail;
        }
    }

    public T removeFirst() {
        if (head == null) return null;
        T data = head.data;
        if (head == tail) {
            head = null;
            tail = null;
            return data;
        }
        head = head.next;
        if (isDoubly && head != null) head.prev = isCircular ? tail : null;
        if (isCircular && tail != null) tail.next = head;
        return data;
    }

    public T peekFirst() {
        return head != null ? head.data : null;
    }

    public T removeLast() {
        if (head == null) return null;
        if (head == tail) {
            T data = head.data;
            head = null;
            tail = null;
            return data;
        }
        if (isDoubly) {
            T data = tail.data;
            tail = tail.prev;
            tail.next = isCircular ? head : null;
            if (isDoubly && head != null && isCircular) head.prev = tail;
            return data;
        }
        // singly linked: traverse to node before tail
        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        T data = tail.data;
        tail = current;
        tail.next = isCircular ? head : null;
        if (isDoubly && head != null && isCircular) head.prev = tail;
        return data;
    }

    public T peekLast() {
        return tail != null ? tail.data : null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
