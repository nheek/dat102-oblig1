package no.hvl.data102.filmarkiv.impl;

public class LinearNode<T> {
    private T element;
    private LinearNode<T> next;

    public LinearNode(T elem) {
        element = elem;
        next = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T elem) {
        element = elem;
    }

    public LinearNode<T> getNext() {
        return next;
    }

    public void setNext(LinearNode<T> node) {
        next = node;
    }
}
