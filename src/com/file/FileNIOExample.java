package com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNIOExample {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/input.txt");
        Path path2 = Paths.get("src/output.txt");
        {
            try {
//                Files.createDirectory(path2);
                Files.copy(path, path2);
                System.out.println("File Copied");
                Files.delete(path);
                System.out.println("File deleted");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}