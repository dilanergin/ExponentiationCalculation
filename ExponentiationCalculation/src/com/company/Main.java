package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        Scanner scan = new Scanner(System.in);
        int total = 1;
        System.out.print("Üstü alınacak sayıyı giriniz: ");
        int n = scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        int k = scan.nextInt();
        for (int i = 1; i <= k; i++) {
            total *= n;

        }
        System.out.println(total);


    }
}
