public class Main {

    public static void main(String[] args){
        sayiBulmaca(); // Yazdığımız metodu main class ı içinde çağırırız.
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[] {1,3,5,7,9,};
        int aranacak = 6;
        boolean varMi= false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                varMi = true;
                break;
            }
        }

        String mesaj = "";
        if (varMi){
            mesajVer("Sayı Mevcuttur: " + aranacak);
            mesajVer(mesaj);
        }else{
            mesajVer("Sayı Mevcut Değildir: " + aranacak);
        }
    }
    // Metodları Son parantez içinde olmalıdır.

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
