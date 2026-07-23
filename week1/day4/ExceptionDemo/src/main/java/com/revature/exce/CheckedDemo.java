package com.revature.exce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}
