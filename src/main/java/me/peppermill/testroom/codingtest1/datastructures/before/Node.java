package me.peppermill.testroom.codingtest1.datastructures.before;

public class Node {

    private Object data;
    private Node next;

    public Node() {
        this.data = null;
        this.next = null;
    }

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
    /*
    * 클라이언트가 맘대로 next 노드를 변경할 수 있어야 하는가?
     */
//    public Node(Object data, Node next) {
//        this.data = data;
//        this.next = next;
//    }

    public Object getData() {
        return toString();
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
