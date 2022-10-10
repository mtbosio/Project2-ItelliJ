public class LinkedList {

    private Node head;
    private int numItems;

    public void LinkedList(){
        this.head = null;
        this.numItems = 0;

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(int numAdded){
        Node n = new Node();
        if(numItems == 0){
            head = n;
            n.setNum(numAdded);
            numItems++;
        }
        else{
            n.setNext(head);
            head = n;
            n.setNum(numAdded);
        }

    }
}
