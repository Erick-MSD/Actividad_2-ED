public class StackQueueTests {
    static int failures = 0;

    static void assertEq(Object a, Object b, String msg) {
        if (a == null ? b != null : !a.equals(b)) {
            System.out.println("FAIL: " + msg + " expected=" + b + " got=" + a);
            failures++;
        } else {
            System.out.println("ok: " + msg);
        }
    }

    static void assertTrue(boolean cond, String msg) {
        if (!cond) {
            System.out.println("FAIL: " + msg);
            failures++;
        } else {
            System.out.println("ok: " + msg);
        }
    }

    public static void main(String[] args) {
        // Tests for Pila
        Pila<String> s = new Pila<>();
        assertTrue(s.isEmpty(), "pila initially empty");
        s.push("A");
        s.push("B");
        assertEq(s.peek(), "B", "peek after pushes");
        assertEq(s.pop(), "B", "pop returns last pushed");
        assertEq(s.pop(), "A", "pop returns next");
        assertTrue(s.isEmpty(), "pila empty after pops");
        assertEq(s.pop(), null, "pop on empty returns null");

        // Tests for Cola
        Cola<String> q = new Cola<>();
        assertTrue(q.isEmpty(), "cola initially empty");
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        assertEq(q.peek(), "1", "peek returns head");
        assertEq(q.dequeue(), "1", "dequeue returns FIFO first");
        assertEq(q.dequeue(), "2", "dequeue order");
        assertEq(q.dequeue(), "3", "dequeue last");
        assertTrue(q.isEmpty(), "cola empty after dequeues");
        assertEq(q.dequeue(), null, "dequeue on empty returns null");

        if (failures > 0) {
            System.out.println("Tests failed: " + failures);
            System.exit(1);
        } else {
            System.out.println("All tests passed.");
            System.exit(0);
        }
    }
}
