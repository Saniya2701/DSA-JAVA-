package LinkedList;
import java.util.*;
import java.util.LinkedList;

public class MergeSort {
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



    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//mid Node
    }

    private Node merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

         while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergesort(Node head){
        
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
       Node newLeft= mergesort(head);
        Node newRight = mergesort(rightHead);

        //merge
         return merge(newLeft,newRight);
    }

    public static void printLL(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}

    

public static void main(String args[]) {
    MergeSort ms = new MergeSort();

    
    head = new Node(5);
    head.next = new Node(4);
    head.next.next = new Node(3);
    head.next.next.next = new Node(2);
    head.next.next.next.next = new Node(1);

    System.out.println("Before sorting:");
    printLL(head);

    head = ms.mergesort(head);

    System.out.println("After sorting:");
    printLL(head);
}

}

//TC = O(nlogn)

