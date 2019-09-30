package LinkedStack;

/**
 *
 * @author Iho
 */
public class LinkedStackFloatNoExcept {
    private class Node {
        private float elem;
        private Node next;

        public Node(float e, Node n) {
            this.elem = e;
            this.next = n;
        }

        public float getElem() {
            return elem;
        }

        public Node getNext() {
            return next;
        }
    }
    private Node top;
    private int size;

    public LinkedStackFloatNoExcept() {
        this.size = 0;
        this.top = null;
    }

    public float top() {
        if (!this.isEmpty()) {
            return this.top.getElem();
        }
        System.err.println("The stack is empty.");
        return 0;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public int size() {
        return this.size;
    }

    public void push(float f) {
        Node n = new Node(f, this.top);
        this.top = n;
        this.size++;
    }

}


