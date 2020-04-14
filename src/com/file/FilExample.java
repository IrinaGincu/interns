package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilExample {
    public static void main(String[] args) throws IOException {
        File myObj = new File("src/filename.txt");
        try {
            if (!myObj.exists()) {
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                }
            } else System.out.println("File already exists.");
        } catch (IOException e) {
            e.getMessage();
        }

        FileWriter myWriter = new FileWriter(myObj);
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");

        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();

        myObj.delete();
        System.out.println("File deleted");
    }
}