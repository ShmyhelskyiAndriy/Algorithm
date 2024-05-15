class Stack<T> {
    Node<T> head;
    Node<T> last;
    int size;
    public void push(T element) {
        Node<T> node = new Node<>(element);
        node.next = head;
        head = node;
        size++;
    }
    public void add(T element) {
        Node<T> node = new Node<>(element);
        if (last == null) {
            head=last=node;
        } else {
            last.next = node;
            last=node;
        }
        size++;
    }
    public T pop() {
        Node<T> temp = head;
        if (temp != null) {
            head = temp.next;
            size--;
        }
        return temp.element;
    }
    public void show() {
        if(isEmpty()) {
            System.out.println("stack is empty");
        }
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.element + "\t");
            temp = temp.next;
        }
    }
    public boolean isEmpty() {
        if(size==0)
            return true;
        return false;
    }
    public static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }
}
