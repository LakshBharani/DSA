package datastructures;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.getTail();

        myDLL.append(10);
        myDLL.append(15);
        myDLL.append(25);
        myDLL.printList();
        myDLL.removeLast();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
    }
}