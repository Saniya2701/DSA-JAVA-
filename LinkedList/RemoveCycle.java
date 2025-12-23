package LinkedList;

public class RemoveCycle {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // addFirst TC = O(1)
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // addLast TC = O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // print LL TC = O(n)
    public static void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // check cycle
    public static boolean IsCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // detect and remove cycle
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) return;

        slow = head;

        // SPECIAL CASE: cycle starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        // normal case
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    public static void main(String args[]) {

        // create loop: 1 -> 2 -> 3 -> 2
        head = new RemoveCycle().new Node(1);
        Node temp = new RemoveCycle().new Node(2);
        head.next = temp;
        head.next.next = new RemoveCycle().new Node(3);
        head.next.next.next = temp;

        System.out.println(IsCycle()); // true
        removeCycle();
        System.out.println(IsCycle()); // false
    }
}
