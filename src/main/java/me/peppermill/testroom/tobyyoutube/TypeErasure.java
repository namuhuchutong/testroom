package me.peppermill.testroom.tobyyoutube;

public class TypeErasure {

    // 아래 node와 동일한 원리가 적용됨
    // extends로 명시하면 그 타입으로 바꿔줌
    // 안할 경우 object
    public static <T> int count(T[] anArray, T elem) {
        int cnt = 0;
        for (T e : anArray) {
            if (e.equals(elem)) {
                ++cnt;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        MyNode mn = new MyNode(5);
        Node n = mn;
        // ClassCastException
        n.setData("hi");
        Integer x = (Integer) mn.getData();
//        Integer x = mn.getData();
    }
}

class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> next;

    Node(T data) {
        this.data = data;
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

class MyNode extends Node<Integer> {
    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.data");
        super.setData(data);
    }

    public void setData(Object data) {
        setData((Integer) data);
    }
}
