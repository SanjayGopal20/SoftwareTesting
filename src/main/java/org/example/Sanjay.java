package org.example;

import java.util.Scanner;

public class Sanjay {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        String lastname = obj.nextLine();
        int age = obj.nextInt();
        System.out.println(name + " " + lastname + " " + age);

        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
            int[] a= new int[5];
           for(int i=0;i<5;i++){
               a[i]= obj.nextInt();
        } for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }

    }
}