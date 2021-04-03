package com.company;

public class Main {

    public static void main(String[] args) {
        // for Döngüsü
        for (int i=1;i<10;i++){
            // i=0;i<10;i+=2 bu şekilde çift sayıları yazdırmış oluruz.
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        // While Döngüsü
        int i=1;// Eğer 2 den başlarsak çift sayı gider.
        while(i<10){
           System.out.println(i);
           i+=2;
        }
        System.out.println("While Döngüsü Bitti");

        // Do-While Döngüsü
        int j=1;
        do{
            System.out.println("Loglandı");
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}