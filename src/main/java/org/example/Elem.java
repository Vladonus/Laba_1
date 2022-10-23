package org.example;

public class Elem {
    int value;
    Elem prev;
    Elem next;
    public Elem(int new_value,Elem prev,Elem next){
        this.next=next;
        this.prev=prev;
        this.value=new_value;
    }
    public Elem(int new_value){
        this.next=null;
        this.prev=null;
        this.value=new_value;
    }
    public int get_value(){return value;};
    public Elem get_prev(){return prev;};
    public Elem get_next(){return next;};
}