public class Node {

    private Node prev;
    private Node next;
    private int num;

    public void Node(){
        this.next = null;
        this.prev = null;
        this.num = 0;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    public int getNum() {
        return num;
    }
}
