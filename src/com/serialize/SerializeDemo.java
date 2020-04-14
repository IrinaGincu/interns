package com.serialize;

import java.io.*;
public class SerializeDemo {

    public static void main(String [] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.number = 101;
        e.SSN = 111256;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("src/employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in src/employee.txt");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}