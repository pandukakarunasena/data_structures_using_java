class Stack {
    private class Node{
        private int data;
        private Node next;

        Node(int data){ this.data = data;}
    }

    private Node top;

    Stack(int data){
        top = new Node(data);
    }

    public void add(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public void pop(){
        if(!isEmpty()){
            top = top.next;
        }else{
            System.out.println("Stack is empty");
        }
    }

    public void peek(){
        if(!isEmpty()) System.out.println(top.data);
        else System.out.println("Stack is empty");

    }

    public void printStack(){
        System.out.print("[");
        Node temp;
        temp = top;
        while(temp != null){
            System.out.print(temp.data +" ,");
            temp = temp.next;
        }
        System.out.println("]");
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void size(){
        int count = 0;
        Node temp = top;
        while(temp != null){
            count += 1;
            temp = temp.next;
        }
        System.out.println(count);
    }
}
