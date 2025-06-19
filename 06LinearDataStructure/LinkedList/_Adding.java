public class _Adding{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step 1 : create new Node
        Node newNode = new Node(data);
        //condition
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 : new Node next to head
        newNode.next = head;
        //step 3 : newNode = head
        head = newNode;
    }
    
    public void addLast(int data){
        //step 1 : create new Node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 : tail ko next krna h
        tail.next = newNode;
        //step 3 : tail = newNode
        tail = newNode;

    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    } 

    public static void main(String [] args){
        _Adding ll = new _Adding();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
        
    }
}