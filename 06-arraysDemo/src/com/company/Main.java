package com.company;

public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Volkan";
        String ogrenci2 = "Tuba";
        String ogrenci3 = "Ahmet";
        String ogrenci4 = "Emine";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------------------");

        String [] ogrenciler = new String [4];
        ogrenciler [0] = "Volkan";
        ogrenciler [1] = "Tuba";
        ogrenciler [2] = "Ahmet";
        ogrenciler [3] = "Emine";
        //ogrenciler [4] = "Mehmet";

        for(int i=0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------------------------");
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
