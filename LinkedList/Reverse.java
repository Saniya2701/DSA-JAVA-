package LinkedList;

public class Reverse {
    
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

//Reverse the ll O(n)
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

        public static void main(String args[]){
            Reverse a1 = new Reverse();
             a1.print();
             a1.addFirst(2);
             a1.print();
             a1.addFirst(1);
             a1.print();
             a1.addLast(3);
             a1.print();
             a1.addLast(4);
             a1.print();

             a1.reverse();
             a1.print();


    }
}

