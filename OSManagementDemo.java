public class OSManagementDemo {
    public static void main(String[] args) {
        Cola<Task> readyQueue = new Cola<>();
        Pila<Task> callStack = new Pila<>();

        // crear algunas tareas
        readyQueue.enqueue(new Task("T1", "Imprimir documento", 2));
        readyQueue.enqueue(new Task("T2", "Cargar archivo", 3));
        readyQueue.enqueue(new Task("T3", "Calcular suma", 1));
        readyQueue.enqueue(new Task("T4", "Enviar email", 2));

        System.out.println("-- Simulación OS: Procesamiento FIFO (Cola) --");
        while (!readyQueue.isEmpty()) {
            Task t = readyQueue.dequeue();
            System.out.println("Procesando (FIFO): " + t);
            // simular que la tarea llama a subrutinas que se apilan
            callStack.push(new Task(t.getId()+"-sub1", "subrutina", 1));
            callStack.push(new Task(t.getId()+"-sub2", "subrutina", 1));
            while (!callStack.isEmpty()) {
                Task s = callStack.pop();
                System.out.println("  Ejecutando subrutina (LIFO): " + s);
            }
        }

        // demo de pila independiente
        System.out.println("\n-- Demo Pila independiente --");
        Pila<String> pila = new Pila<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        while (!pila.isEmpty()) {
            System.out.println("Pop: " + pila.pop());
        }

        System.out.println("\nDemo completada.");
    }
}
