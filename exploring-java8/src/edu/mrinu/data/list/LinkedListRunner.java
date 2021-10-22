package edu.mrinu.data.list;

class Node {
    Integer data;
    Node next;
    Node(Integer data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList {

    int size;
    Node head;

    void add(Integer data) {

        Node node = new Node(data);

        if(head == null) {
            head = node;
            size++;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null)
            currentNode = currentNode.next;

        currentNode.next = node;
        size++;
        return;
    }

    void remove(Integer value) {

        // IF head is target THEN
        if(head.data==value){
            // head will point head-next
            head=head.next;
            // AND stop
            return;
        }

        // previous node is head
        Node preNode = head;
        // current node is head-next
        Node currentNode = head.next;
        // traverse util current node is null
        while(currentNode!=null) {
            // IF current-data is value THEN
            if(currentNode.data==value) {
                // pre-next is current-next
                preNode.next = currentNode.next;
                // AND stop
                break;
            }
            // pre is current
            preNode = currentNode;
            // current is current-next
            currentNode = currentNode.next;
        }
    }

    void show() {
        Node currentNode = head;
        while (currentNode!=null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
public class LinkedListRunner {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(5);
        list.add(9);
        list.add(2);
        list.add(6);
        list.add(3);

        list.remove(3);

        list.show();
    }
}
