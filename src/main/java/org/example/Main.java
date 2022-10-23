package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        List Spisok =new List();
        System.out.print("Enter the number of elements:");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            Spisok.add(i+1);
        }
        System.out.print("List generated!Display on screen:");
        Spisok.print();
        System.out.println();
        System.out.print("Enter the element to remove:");
        int i=in.nextInt();
        System.out.print(Spisok.remove(i-1));
        System.out.println();
        System.out.print("Display on screen after removal:");
        Spisok.print();
        System.out.println();
        System.out.print("Enter the element to get:");
        i=in.nextInt();
        System.out.print(Spisok.get(i-1));
        System.out.println();
    }
}