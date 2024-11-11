public class LinkedList{
    //class for node
    public static class Node{
        int data;
        Node next;
        
        //constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    //add first
    public void addFirst(int data){
        //step 1 : to create a new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }

        //step 2 : newNode's next
        newNode.next = head;

        //step 3 : head = new Node
        head = newNode;
    }

    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    }
}