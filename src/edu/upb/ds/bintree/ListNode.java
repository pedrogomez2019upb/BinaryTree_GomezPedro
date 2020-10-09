package edu.upb.ds.bintree;

public class ListNode {
    public Object object;
    public ListNode next;

    public ListNode(Object object)
    {
        this.object = object;
        this.next = null;
    }
    public ListNode(){}

    public ListNode(Object object, ListNode next) {
        this.object = object;
        this.next = next;
    }

    public Object getObject()
    {
        return object;
    }

    public void setObject(Object object)
    {
        this.object = object;
    }

    public void linkNext(ListNode n)
    {
        next=n;
    }
    public ListNode getNext()
    {
        return next;
    }

    public void setNext(ListNode next)
    {
        this.next = next;
    }

    @Override
    public String toString()
    {
        return "ListNode{" +
                "object=" + object +
                ", next=" + next +
                '}';
    }
}
