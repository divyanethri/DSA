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
    }
 }

class Node{
    int data;
    Node next;
}   
