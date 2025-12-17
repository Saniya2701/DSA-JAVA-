package LinkedList;

public class isCycle {
    
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
        
//addfirst TC = O(1)
        public void addFirst(int data){
            //step 1 : create new node
            Node newNode = new Node(data);
          
            if(head == null){
                head = tail = newNode;
                return;
            }
            //step 2 : newNode nest = head(it is step of creation of LL)
            newNode.next = head;

            //step 3 : head = newnode
            head = newNode;
        }
         

//addlast  TC = O(1)
        public void addLast(int data){
          Node newNode = new Node(data);
          if(head == null){
            head = tail = newNode;
            return;
          }
          tail.next = newNode;
          tail = newNode;
        }

//print LL  TC = O(n)
        public static void print(){
            if(head == null){
                System.out.println("LL is empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +"--> " );
                temp = temp.next;
            }
            System.out.println("null");
        }        


//check is their any cycle/loop in our LL using slow-fast approach

        public static boolean IsCycle(){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }
        public static void main(String args[]){
            isCycle a1 = new isCycle();
             a1.print();
             a1.addFirst(2);
             a1.print();
             a1.addFirst(1);
             a1.print();
             a1.addLast(3);
             a1.print();
             a1.addLast(4);
             a1.print();

             // we create the loop
             head = new Node(1);
             head.next = new Node(2);
             head.next.next = new Node(3);
             head.next.next.next = head;
            
             System.out.println(IsCycle());

    }
}
