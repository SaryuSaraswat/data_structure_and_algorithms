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
            return;
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
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void print(){
        
        Node temp = head; //we assign head to a temp variable
       
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void add(int idx, int data){

        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        print();
        ll.addFirst(2);
        print();
        ll.addFirst(1);
        print();
        ll.addLast(3);
        print();
        ll.addLast(4);
        print();

        ll.add(2, 9);
        print();
    }
}