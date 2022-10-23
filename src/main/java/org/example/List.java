package org.example;

/**
 * Container class
 */
public class List {
    /**
     * the base of an double linked list container
     */
    private Elem phead;
    private Elem tail;


    /**
     * The function of adding an element to the container
     * @param new_value item to add
     */
    public void add(int new_value) {
        if(this.phead==null){
            this.phead=new Elem(new_value);
            this.tail=this.phead;
        }
        else{
            this.tail.next=new Elem(new_value,this.tail,null);
            this.tail=this.tail.next;
        }
    }

    /**
     * *Method of deleting an element
     * @param value index of the item to delete
     * @return the result of the function as a string
     */
    public String remove(int value){
        int i=0;
        Elem cur=this.phead;
        while(i<value && cur!=null ) {
            i++;
            cur=cur.next;
        }
        if(cur!=null && i == value) {
            if(i!=0){
                cur.prev.next=cur.next;
                if(cur.next!=null){
                    cur.next.prev=cur.prev;
                }
            }
            else{
                this.phead=this.phead.next;
                this.phead.prev=null;
            }
            cur.next=null;
            cur.prev=null;
            cur=null;
            return "Item removed";
        }
        else{
            return "Element not found";
        }
    }

    /**
     * * Method for getting the element value
     * printing list of all elements
     */
    public void print() {
        Elem cur=this.phead;
        while(cur!=null){
            System.out.print(cur.value);
            System.out.print(" ");
            cur=cur.next;
        }
    }

    /**
     * Method for getting the element value
     * @param search index of the element to get the value
     * @return node of the element with the given index
     */
    public int get(int search){
        int i=0;
        int result=-1;
        Elem cur =this.phead;
        while (i<search && cur !=null){
            cur=cur.next;
            i++;
        }
        if(i!=search || cur ==null ){
            System.out.print("Dynamic memory error!");
        }
        else{
            result=cur.value;
        }
        return result;
    }
}