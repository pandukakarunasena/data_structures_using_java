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
    private Node tail;

    DoublyLinkedList(int data){
        front = new Node(data);
        tail = front;
    }

    public void addToFront(int data){
        Node node = new Node(data);
        node.previous = front;
        front.next = node;
        front = node;
    }

    public void addToTail(int data){
        Node node = new Node(data);
        tail.previous = node;
        node.next = tail;
        tail = node;
    }

    public void removeFromFront(){
        Node temp = front;
        front = front.previous;
    }

    public void removeFromTail(){
        Node temp = tail;
        tail = tail.next;
    }

    public void add(int data,int x ,String place){
        if(place.equals("f")){
            Node f = front;
            while(f != null){
                if(f.data == x){
                    Node node = new Node(data);
                    Node temp = f.next;

                    f.next = node;
                    node.next = temp;

                    temp.previous = node;
                    node.previous = f;
                }
                f = f.previous;
            }
        }
        if(place.equals("b")){

        }
    };

    public void printDLL(){
        System.out.print("[");
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data +" ,");
            temp = temp.previous;
        }
        System.out.println("]");
    }


}


