package com.company;

public class Main {

    private static String reg;

    public Main() {
    }

    public static void main(String[] args, String regex) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5.Eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        char srcBegin = 0;
        char srcEnd = 5;
        char dstBegin = 0;
        mesaj.getChars(srcBegin,srcEnd,karakterler,dstBegin);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));*/

        String oldChar = " ";
        String newChar = "/";
        String yeniMesaj = mesaj.replace(oldChar,newChar);
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 5));

        for (String kelime : regex.split( mesaj: " "))
    }
}
