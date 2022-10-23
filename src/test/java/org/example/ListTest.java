package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ListTest{
    List Spisok=new List();
    @BeforeEach
    public void starting(){
        for(int i=0;i<11;i++){
            Spisok.add(i);
        }
    }

    @Test
    void add(){
        Spisok.add(100);
        assertEquals(100,Spisok.get(11));
    }

    @Test
    void remove(){
        assertEquals("Item removed",Spisok.remove(3));
    }

    @Test
    void get(){
        assertEquals(1,Spisok.get(1));
    }
}