package LinkedList;

import java.util.LinkedList;

public class LearnLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("vishal");
        linkedlist.add("vikas");
        linkedlist.add("diksha");
        System.out.println(linkedlist);
        System.out.println(linkedlist.getFirst());
        System.out.println(linkedlist.getLast());
    }
}
