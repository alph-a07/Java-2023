package exceptions_java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        // Throws FileNotFoundException
        FileReader file = null;
        try {
            file = new FileReader("D:\\Java masterclass\\Java 2023\\src\\files\\demo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file path : " + e);
        }

        BufferedReader fileInput = new BufferedReader(file);

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(fileInput.readLine()); // Throws IOException
            } catch (IOException e) {
                System.out.println("Invalid file input : " + e);
            }
        }

        try {
            fileInput.close(); // Throws IOException
        } catch (IOException e) {
            System.out.println("Error occurred : " + e);
        }
    }
}
