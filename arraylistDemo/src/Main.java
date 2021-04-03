import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList sayilar = new ArrayList();

        sayilar.add(1);//eleman ekler
        sayilar.add(10);
        sayilar.add("Ankara");
        
        //System.out.println(sayilar.size());
        //System.out.println(sayilar.get(3));
        //sayilar.set(0,100);//belirtilen elemanı değiştirir
        //System.out.println(sayilar.get(0));
        //sayilar.remove(0);//belirtilen elemanı siler
        //sayilar.clear();//Tüm elemanları siler

        for (Object i:sayilar){
            System.out.println(i);
        }
    }
}
