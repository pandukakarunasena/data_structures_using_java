class DoublyLinkedList {
    private class Node{
        private int data;
        private Node next = null;
        private Node previous = null;

        Node(int data){
            this.data = data;
        }
    }

    private Node front;
    private Node tail = front;

    DoublyLinkedList(int data){
        front = new Node(data);
    }

    public void addToFront(int data){
        Node node = new Node(data);
        node.previous = front;
        front = node;
    }

    public void addToTail(int data){
        Node node = new Node(data);

    }

    public void removeFromFront(){

    }

    public void removeFromTail(){

    }
}


