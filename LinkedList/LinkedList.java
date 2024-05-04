package LinkedList;

public class LinkedList {
    public static void addLast(Node head, int val){
        if (head == null) {
            // If the list is empty, set head to the new node
            head = new Node();
            head.data = val;
            head.next = null;
        } else {
            // Otherwise, traverse the list to find the last node
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            // Create a new node and add it to the end of the list
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;
            temp.next = newNode;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!= null){
            // System.out.print(temp.next + " ");
            System.out.print(temp.data + " ");
            temp = temp.next;
        
        }
        System.out.println();
    }

    public static Node removeFirst(Node head){
        return head.next;
    }

    public static void getFirst(Node head){
        System.out.println(head.data);
    }

    public static void getLast(Node head){
        Node temp = head;
        while(temp!=null){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    
    public static void getAt(Node head, int idx){
        Node temp = head;
        for(int i = 0; i< idx - 1; i++){
            if(temp.next != null){
                temp= temp.next;
            }
        }
        System.out.println(temp.data);
    }

    public static Node addFirst(Node head, int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        return newNode;
    }
    
    public static void addAt(Node head, int val, int index){
        Node temp = head;
        Node newNode = new Node();
        for(int i =0; i< index-1; i++){
            if(temp.next!= null){
                temp = temp.next;
            }
        }
        newNode.data = val;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public static void removeLast(Node head){
        Node temp = head;
        while(temp.next.next!= null){
            temp = temp.next;
        }
        temp.next = null;
    }
    
    public static int size(Node head){
        int size = 1;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        return size;

    }

    public static Node getNodeAt(Node head, int index){
        Node temp = head;
        for (int i = 0; i < index; i++) { // Change the loop condition
            if (temp != null) { // Check if temp is not null before accessing its next node
                temp = temp.next;
            } else {
                break; // If temp is null, break the loop to avoid NullPointerException
        }
    }
    return temp;
    }

    public static void reverseDataIterative(Node head) {
        int leftIndex = 0;
        int rightIndex = size(head)-1;
        while (leftIndex <= rightIndex) {
            Node left = getNodeAt(head, leftIndex);
            Node right = getNodeAt(head, rightIndex);
            int temp = left.data;
            left.data = right.data;
            right.data = temp;
            leftIndex++;
            rightIndex--;
        }
        display(head);
    }

    public static void reversePointerIterative(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev; // Update the head to point to the new first node
        display(head);
    }  

    public static void removeAt(Node head, int index){
        if (head == null) {
            return; // Handle empty list case
        }
    
        if (index == 0) {
            head = head.next;
            return; // Handle removing the head node
        }
    
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null || temp.next == null) {
                return; // Early exit if temp or temp.next is null
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String [] args){
        Node head = new Node();
        addLast(head, 10);
        addLast(head, 8);
        addLast(head, 3);
        addLast(head, 5);
        display(head);
        head =  removeFirst(head); //Remove First;
        getFirst(head);
        getLast(head);
        getAt(head, 2);
        head = addFirst(head, 45);
        display(head);
        addAt(head, 66 , 2 );
        addAt(head, 98 , 2 );
        display(head);
        System.out.println(size(head));
        removeLast(head);
        display(head);
        System.out.println(size(head));
        reverseDataIterative(head);
        // reversePointerIterative(head);
        removeAt(head, 3);
        System.out.println(size(head));
        display(head);
    }
 }

class Node{
    int data;
    Node next;
}   
