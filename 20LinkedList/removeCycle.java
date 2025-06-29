public class removeCycle{
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

    public static boolean removeLoop(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return false;
        }

        //find last node
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //assign prev.next -> null
        prev.next = null;
        return true;
    }

    public static void main(String [] args){
       head = new Node(1);
       Node temp = new Node(2);
       head.next = temp;
       head.next.next = new Node(3);
       head.next.next.next = temp;
       
       System.out.println(removeLoop());
    }
}