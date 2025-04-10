package LinkedList;

import java.util.LinkedList;

// this is the Node of my linkedlist
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
// this is to create linkedlist
public class LearnLinkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next = new Node(40);
//       printlist(head);
        System.out.println("This will be the position of this particular value: " + searchValue(head, 20));
        head = insertHead(head, 5);
        printList(head);
    }

    //  this is to insert new head
    public static Node insertHead(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    // print list
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data +" ");
            curr= curr.next;
        }
        System.out.println();
    }

    // Search for a number in Linked List
    public static int searchValue(Node head, int x) {
        int position = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x) {
                return position;
            } else {
                curr = curr.next;
                position++;
            }
        }
        return -1;

    }
}

    // this is to print linked list
//    public static void printlist(Node head){
//        Node curr = head;
//        while(curr!=null){
//            System.out.println(curr.data);
//            curr= curr.next;
//        }
//    }

