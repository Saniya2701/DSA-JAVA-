package LinkedList;

public class Palindrome {
    
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

 // palindromem - slow-fast Approach
        public Node findMid(Node head){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow; // slow is midNode
        }   
        
         public boolean checkpalindrome(){
            if(head == null  ||  head.next == null){
                return true;
            }
            // step 1 - find mid
            Node midNode = findMid(head);

            //step 2 - reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;
            Node left = head;

            //step 3 - check left half & right half
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
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
            Palindrome a1 = new Palindrome();
             a1.print();
             a1.addFirst(2);
             a1.print();
             a1.addFirst(1);
             a1.print();
             a1.addLast(3);
             a1.print();
             a1.addLast(4);
             a1.print();

             System.out.println(a1.checkpalindrome());


    }
}

