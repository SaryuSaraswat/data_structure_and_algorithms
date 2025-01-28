public class DeleteNthNodeFromLast{

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

    //add last
    public void addLast(int data){
        //step1 to create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 : tail's next
        tail.next = newNode;

        //step3 : tail = newNode
        tail = newNode;
    }

    public static void main(String [] args){
        DeleteNthNodeFromLast ll = new DeleteNthNodeFromLast();
        ll.addLast(1);
        ll.addLast(2);
    }
}