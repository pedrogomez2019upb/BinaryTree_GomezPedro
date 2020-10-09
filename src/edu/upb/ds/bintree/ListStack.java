package edu.upb.ds.bintree;

import java.util.Arrays;

public class ListStack implements StackInterface{
    public int size;
    public ListNode top;

    public ListStack(){}

    public ListStack(int size, ListNode top) {
        this.size = size;
        this.top = top;
    }

    @Override
    public void clear() {
        top=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public Object peek() {
        Object temporalTop = top.object;
        return temporalTop;
    }

    @Override
    public Object pop() {
        ListNode temporalTop= top;
        top=top.next;
        size--;
        return temporalTop.object;
    }

    @Override
    public boolean push(Object object) {
        ListNode temporalTop = new ListNode(object);
        temporalTop.next=top;
        top=temporalTop;
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean search(Object object) {
        boolean result=false;
        while(!isEmpty()){
            Object temporaryNode=top.object.toString();
            top=top.next;
            if (temporaryNode==object){
                result=true;
            }
        }
        return result;
    }

    @Override
    public void sort() {
        Object[] array =  new Object[size];
        ListNode temporaryNode = top;
        for (int i = 0; i <this.size ; i++) {
            array[i] = temporaryNode.getObject();
            temporaryNode = temporaryNode.next;
        }
        Arrays.sort(array);
        ListStack pilanueva = new ListStack();
        int contador =0;
        for (int i = array.length-1; i >= 0 ; i--) {
            pilanueva.push(array[contador]);
            contador++;
        }
        top = pilanueva.top;
    }

    @Override
    public void reverse() {
        ListStack stack = new ListStack();
        while(!isEmpty()){
            stack.push(this.pop());
        }
        top=stack.top;
        size=stack.size;
        //return stack;
    }



    @Override
    public String toString() {
        return "ListStack{" +
                "size=" + size +
                ", top=" + top +
                '}';
    }
}
