package garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator{
    public static void main(String[] args) {
        String string = "";
        try {
            long start = System.currentTimeMillis();
            File myObj = new File("D:\\Hedspi HUST\\OOP_LAB\\test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for(int i = 0;i<data.length();i++){
                    string += data.charAt(i);
                }
            }
            myReader.close();
            System.out.println(System.currentTimeMillis() - start);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}