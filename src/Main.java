import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String s="";
        try(FileReader reader = new FileReader("input.txt"))
        { // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                s+=(char)c; }
        }
 catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        String out = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            out += (char)(c - 1);
        }



        try (FileWriter writer = new FileWriter("output.txt",
                false))
        { // подготавливаем строку для записи
            writer.write(out);

            // сохранение записи
            writer.flush();
        }
 catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}