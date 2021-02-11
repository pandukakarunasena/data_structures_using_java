class Queue {
    private class Node{
        private int data;
        private Node next;

        Node(int data){ this.data = data;}
    }

    private Node head, tail;

    Queue(int  data) {
        head = new Node(data);
        tail = head;
    }

    public void enqueue(int data){
        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }

    public void dequeue(){
        head = head.next;
    }

    public void print(){
        System.out.print("[");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ,");
            temp = temp.next;
        }
        System.out.println("]");
    }

}
