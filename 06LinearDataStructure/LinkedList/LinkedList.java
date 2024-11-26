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
    public static int size;

    //add first
    public void addFirst(int data){
        //step 1 : to create a new node
        Node newNode = new Node(data);
        size++;
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
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    //print linkedlist
    public void print(){
        
        Node temp = head; //we assign head to a temp variable
       
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    
    //adding element in middle of linkedlist
    public void add(int idx, int data){

        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    //remove first 
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //removeLast
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev : i = size-2
        Node prev = head;
        for(int i = 0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    

    //main method
    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        ll.print();

        ll.addFirst(2);
        ll.print();

        ll.addFirst(1);
        ll.print();

        ll.addLast(3);
        ll.print();

        ll.addLast(4);
        ll.print();

        ll.add(2, 9);
        ll.print();

        System.out.println(ll.size);
        
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

    }
}
 