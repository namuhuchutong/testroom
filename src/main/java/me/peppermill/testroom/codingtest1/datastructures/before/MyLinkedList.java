package me.peppermill.testroom.codingtest1.datastructures.before;

public class MyLinkedList {

    private Node dummyNode;
    private Node currentNode;

    public MyLinkedList() {
        this.dummyNode = new Node();
        this.currentNode = null;
    }

    public void add(Node data) {
        if (this.dummyNode.getNext() == null)
            addFirst(data);

        goNodeNext(data);
        setCurrentNode(data);
    }

    public void delete(Node node) {
        setCurrentNode(showHeadNode());
        while (this.currentNode.getNext().equals(node)) {
            goNodeNext(this.currentNode);
        }
        this.currentNode.setNext(currentNode.getNext().getNext());
    }

    public void print() {
        setCurrentNode(showHeadNode());
        while (this.currentNode != null) {
            System.out.println("currentNode = " + currentNode.toString());
            this.currentNode = currentNode.getNext();
        }
    }

    private void goNodeNext(Node node) {
        this.currentNode.setNext(node);
        this.currentNode = this.currentNode.getNext();
    }

    private Node showHeadNode() {
        if (this.dummyNode.getNext() == null) {
            throw new NullPointerException("현재 리스트가 비었음");
        }

        return this.dummyNode.getNext();
    }

    private void addFirst(Node data) {
        this.dummyNode.setNext(data);
        this.currentNode = dummyNode;
        this.currentNode = currentNode.getNext();
    }

    private void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }
}
