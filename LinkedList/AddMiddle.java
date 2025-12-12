package LinkedList;
import java.util.*;
public class AddMiddle{
    
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
        
        //addmiddle
        public void add(int idx,int data){
            if(idx==0){
                addFirst(data);
                return;
            }
            //create new node
            Node newNode = new Node(data);
            Node temp = head;
            int i=0;

            while(i< idx-1){
                temp = temp.next;
                i++;
            }

            //i=idx-1; temp-->prev
            newNode.next = temp.next;
            temp.next = newNode;
        }

        public static void main(String args[]){
            AddMiddle a1 = new AddMiddle();
             a1.print();
             a1.addFirst(2);
             a1.print();
             a1.addFirst(1);
             a1.print();
             a1.addLast(3);
             a1.print();
             a1.addLast(4);
             a1.print();
             a1.add(2,9);
             a1.print();


    }
}
