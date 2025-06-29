public class _Add_Remove{
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
    public static int size;

    public void addFirst(int data){
        //step 1 : create new Node
        Node newNode = new Node(data);
        size++;

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
        size++;

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
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    } 

    public void addMiddle(int index, int data){

        if(index == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){

        if(size == 0){
            System.out.println("LL is empty");
        } else if(size == 1){
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

    public int removeLast(){

        if(size == 0){
            System.out.println("LL is empty");
        } else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev : i= size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        
        int val = prev.next.data; //data of tail
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    public static void main(String [] args){
        _Add_Remove ll = new _Add_Remove();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();
        System.out.println(ll.size);
        
        ll.removeLast();
        ll.print();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        

        ll.addMiddle(1, 100);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        
    }
}