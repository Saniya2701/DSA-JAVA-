package LinkedList;

public class RemoveNth {
    
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

//Find and remove the nth node from end
         public void deleteNthfromEnd(int n){
            int size =0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                size++;
            }
            if(n == size){
                head = head.next;
                return;
            }

            int i =1;
            int iToFind = size - n;
            Node prev = head;
            while(i< iToFind){
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
            return;
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
            RemoveNth a1 = new RemoveNth();
             a1.print();
             a1.addFirst(2);
             a1.print();
             a1.addFirst(1);
             a1.print();
             a1.addLast(3);
             a1.print();
             a1.addLast(4);
             a1.print();

             a1.deleteNthfromEnd(3);
             a1.print();


    }
}

