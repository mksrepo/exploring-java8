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
        if(head.data==value){
            head=head.next;
            return;
        }

        Node preNode = head;
        Node currentNode = head.next;
        while(currentNode!=null) {
            if(currentNode.data==value) {
                preNode.next = currentNode.next;
                break;
            }
            preNode = currentNode;
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

        list.remove(5);

        list.show();
    }
}
