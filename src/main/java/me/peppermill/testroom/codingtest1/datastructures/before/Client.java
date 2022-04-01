package me.peppermill.testroom.codingtest1.datastructures.before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.runList();
    }

    private void runList() {
        MyLinkedList list = new MyLinkedList();
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        list.print();
        list.delete(new Node(2));
        list.print();
    }
}
