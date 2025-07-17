public class CustomLinkedList<T> {
    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;
    private int length;

    public LinkedListNode<T> getHead() {
        return this.head;
    }

    public LinkedListNode<T> getTail() {
        return this.tail;
    }

    public T delete(T val) {
        LinkedListNode<T> cur = this.head;

        

        while (cur != null) {
            if (cur.val == val) {

            }
            cur = cur.next;
        }
    }

    public String toString() {
        LinkedListNode<T> cur = this.head;
        StringBuilder retString = new StringBuilder();

        while (cur != null) {
            retString.append(cur.val + ", ");
            cur = cur.next;
        }

        return retString.toString();
    }
}

class LinkedListNode<T> {
    public T val;
    public LinkedListNode<T> next;
}