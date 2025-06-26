public class Search{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
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

    public int iterativeSearch(int key){
        Node temp = head;
        
        int ans = -1;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                ans = i;;
                break;
            }
            temp = temp.next;
            i++;
        }
        return ans;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int index = helper(head.next , key);
        if(index == -1){
            return -1;
        }

        return index+1;
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }


    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void main(String [] args){
        Search ll = new Search();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
        System.out.println(ll.iterativeSearch(2));
        System.out.println(ll.iterativeSearch(4));

        System.out.println(ll.recursiveSearch(4));
        System.out.println(ll.recursiveSearch(3));

        ll.reverse();
        ll.print();
    }
}