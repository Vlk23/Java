package com.company;

public class Main {

    public static void main(String[] args) {
        int sayi = 24;
        if(sayi<20) {
            System.out.println("Sayı 20'den küçüktür.");
            // Eğer sayı 20'den küçük ise yazdır.
        }else if(sayi == 20){
            System.out.println("Sayı 20'ye eşittir.");
            //Eğer sayı 20'ye eşit ise yazdır
        }else{
            System.out.println("Sayı 20'den büyüktür.");
            //Eğer yukarıdaki koşul ya da koşullar sağlanamadıysa yazdır.
        }
    }
}