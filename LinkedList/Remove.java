package LinkedList;

public class Remove {
    
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
        
//addfirst TC = O(1)
        public void addFirst(int data){
            //step 1 : create new node
            Node newNode = new Node(data);
            size++;
          
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
          size++;
          if(head == null){
            head = tail = newNode;
            return;
          }
          tail.next = newNode;
          tail = newNode;
        }

 //RemoveFirst
         public int removeFirst(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){ // if there is only 1 element in LL
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
         
 //RemoveLast
         public int removeLast(){
            if(size==0){
                System.out.println("Ll is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            //prev : i = size -2
            Node prev = head;
            for(int i=0;i<size-2;i++){
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size --;
            return val;
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
            Remove a1 = new Remove();
             a1.print();
             a1.addFirst(2);
             a1.print();
             a1.addFirst(1);
             a1.print();
             a1.addLast(3);
             a1.print();
             a1.addLast(4);
             a1.print();

             a1.removeFirst();
             a1.print();
             a1.removeLast();
             a1.print();

             System.out.println(a1.size);


    }
}


