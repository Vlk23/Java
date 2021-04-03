import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //createFile(); dosya oluşturduk.
        //getFileInfo();
        readFile();
        writeFile();
        readFile();
    }
    public static void createFile(){
        File file = new File("C:\\Users\\TaNeM\\IdeaProjects\\volkan\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu.");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\Users\\TaNeM\\IdeaProjects\\volkan\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Yazılabilir dosya mı?: " + file.canWrite());
            System.out.println("Okunabilir dosya mı?: " + file.canRead());
            System.out.println("Dosya boyutu (byte) : " + file.length());
        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\TaNeM\\IdeaProjects\\volkan\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\TaNeM\\IdeaProjects\\volkan\\files\\students.txt",true));
            writer.newLine();
            writer.write("ahmet");
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
