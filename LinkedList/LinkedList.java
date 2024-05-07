package LinkedList;

public class LinkedList {
    public static Node addLast(Node head, int val){
      
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            // Create a new node and add it to the end of the list
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;
            temp.next = newNode;
        return head;
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
        head = head.next;
        return head;
    }

    public static Node getFirst(Node head){
        return head;
    }

    public static Node getLast(Node head){
        Node temp = head;
        while(temp!=null){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        return temp;
        // System.out.println(temp.data);
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
        for (int i = 0; i < index-1 ; i++) {
            if (temp == null || temp.next == null) {
                return; // Early exit if temp or temp.next is null
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void stackUsingLL(){

    }

    // public static void queueUsingLL(){

    // }

    public static void kthEleFromEnd(Node head,int k ){
        Node slow = head;
        Node fast = head;
        for(int i=0; i<k; i++){
            fast = fast.next;// to get the k difference between slow and fast. 
            // so when fast pointer point last node slow points will be pointing to last kth element ;
        }
        while(fast != null){
            slow= slow.next;
            fast= fast.next;
        }
       System.out.println(slow.data);
    }

    public static Node  push(Node head , int val) {
       return  addFirst(head, val);
    } 

    public static Node peek(Node head) {
        return getFirst(head);
    }

    public static Node pop(Node head) {
       return removeFirst(head);
    } 

    public static int  stackSize(Node head) {
       return size(head);
    }
    
    public static void enQueue(Node head, int val){
          addLast(head, val);
          Node temp = getLast(head);
          System.out.println(temp.data);
    }

    public static void deQueue(Node head){
        removeFirst(head);
        display(head);
    }

    public static void middleOfLL(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next !=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    
    }

    public static void mergeSort(Node head, Node head2){
        Node one = head;
        Node two = head2;
        Node res = new Node();
        while(one !=null && two != null){
            if(one.data < two.data){
                System.out.println("working");
                res = addLast(res, one.data);
                one = one.next;
            }
            else{
                res = addLast(res, two.data);
                two= two.next;
            }
        }
        while(one!=null){
            res = addLast(head2, one.data);
        }
        while(two!=null){
            res= addLast(head2, two.data);
        }
        display(res);
    }

    public static void main(String [] args){
        Node head = new Node();
        Node head2 = new Node();
        addLast(head, 10);
        addLast(head, 8);
        addLast(head, 3);
        addLast(head, 5);
        display(head);

        addLast(head2, 88);
        addLast(head2, 98);
        addLast(head2, 78);
        addLast(head2, 67);
        addLast(head2, 45);
        display(head2);
        // head =  removeFirst(head); //Remove First;
        // getFirst(head);
        // getLast(head);
        // getAt(head, 2);
        // head = addFirst(head, 45);
        // display(head);
        // addAt(head, 66 , 2 );
        // addAt(head, 98 , 2 );
        // display(head);
        // System.out.println(size(head));
        // removeLast(head);
        // display(head);
        // System.out.println(size(head));
        // reverseDataIterative(head);
        // // reversePointerIterative(head);
        // removeAt(head, 3);
        // System.out.println(size(head));
        // display(head);
        // System.out.println(peek(head).data);
        // System.out.println(stackSize(head));
        // head = push(head, 55);
        // display(head);
        // head = pop(head);
        // display(head);
        // System.out.println(peek(head).data);
        // System.out.println(stackSize(head));
        // enQueue(head, 65);
        // deQueue(head);
        // // queueUsingLL();
        // kthEleFromEnd(head, 3);
        // display(head);
        // middleOfLL(head);
         mergeSort(head, head2);
       
    }
 }


class Node{
    int data;
    Node next;
}   
