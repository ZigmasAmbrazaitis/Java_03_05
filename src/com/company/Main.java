package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int[] masyvas = new int[5];
        System.out.println("Iveskite penkis skaicius: ");

        for (int i = 0; i < 5; i++) {
            masyvas[i] = sc.nextInt();
            suma += masyvas[i];
        }
        System.out.println("Suma yra lygi: " + suma);
        System.out.println("Jusu ivesti skaiciai: ");

        for (int i = 0; i < 5; i++) {
            System.out.println(masyvas[i]);
        }
        // System.out.println("Pasirinkti skaiciai: " + masyvas[0] + ", " + masyvas[1] + ", " + masyvas [2] + ", " + masyvas[3] + ", " + masyvas[4] + ".");
    }
}
