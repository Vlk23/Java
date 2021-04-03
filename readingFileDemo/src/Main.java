import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static BufferedReader reader = null;
    public static void main(String[] args) throws IOException {
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\TaNeM\\IdeaProjects\\volkan\\readingFileDemo\\src\\sayilar.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            reader.close();
        }
    }
}
