import java.lang.IndexOutOfBoundsException;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    private class Node<T> {
        private Node<T> next;
        private T value;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public LinkedList() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(T value) {
        Node<T> newNode = new Node<T>(value, null);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> curr;
            for (curr = head; curr.next != null; curr = curr.getNext());
            curr.setNext(newNode);
        }
        size++;
    }

    public void add(int i, T value) {
        if (i > size) {
            throw new IndexOutOfBoundsException();
        }

        size++;

        if (i == 0) {
            head = new Node<T>(value, head);
            return;
        }

        int count = 0;
        for (Node<T> curr = head; curr != null; curr = curr.getNext()) {
            if (count + 1 == i) {
                Node<T> newNode = new Node<T>(value, curr.getNext());
                curr.setNext(newNode);
            }
            count++;
        }
    }

    public T get(int i) {
        if (i > size - 1) {
            throw new IndexOutOfBoundsException();
        }

        int count = 0;
        for (Node<T> curr = head; curr != null; curr = curr.getNext()) {
            if (count == i) {
                return curr.getValue();
            }
            count++;
        }
        return null;
    }

    public void remove(int i) {
        if (i > size -1) {
            throw new IndexOutOfBoundsException();
        }

        size--;

        if (i == 0) {
            head = head.getNext();
            return;
        }

        int count = 0;
        for (Node<T> curr = head; curr != null; curr = curr.getNext()) {
            if (count + 1 == i) {
                curr.setNext(curr.getNext().getNext());
            }
            count++;
        }
    }
}