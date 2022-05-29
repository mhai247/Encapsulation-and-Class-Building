package garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class NoGarbage {
    public static void main(String[] args) {
        String string = "";
        try {
            long start = System.currentTimeMillis();
            File myObj = new File("D:\\Hedspi HUST\\OOP_LAB\\test.txt");
                    Scanner myReader = new Scanner(myObj);
            StringBuffer sb = new StringBuffer();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for(int i = 0;i<data.length();i++){
                    sb.append(data.charAt(i));
                }
            }
            myReader.close();
            string = sb.toString();
            System.out.println(System.currentTimeMillis() - start);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}