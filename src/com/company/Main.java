package com.company;

import java.util.Scanner;

public class Main {
    private int suma;
    private int masyvas[];

    public static void main(String[] args) {

        Main objektas = new Main();
        objektas.nuskaitymas();
        objektas.isvedimas();
    }

    public void nuskaitymas() {
        Scanner sc = new Scanner(System.in);
        masyvas = new int[5];
        for (int i = 0; i<masyvas.length; i++) {
            System.out.println("Iveskite skaiciu nr. " + (i+1) + ": ");
            masyvas[i] = sc.nextInt();
            suma += masyvas[i];
        }
    }

    public void isvedimas() {
        System.out.println("Suma yra lygi: " + suma);
        System.out.println("Jusu ivesti skaiciai: ");

        for (int i = 0; i <masyvas.length; i++) {
            System.out.println("Jusu " + (i+1) + "-asis ivestas skaicius: " + masyvas[i]);
        }
        // System.out.println("Pasirinkti skaiciai: " + masyvas[0] + ", " + masyvas[1] + ", " + masyvas [2] + ", " + masyvas[3] + ", " + masyvas[4] + ".");
    }
}
