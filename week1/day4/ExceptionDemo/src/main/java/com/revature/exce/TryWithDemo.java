package com.revature.exce;

import java.io.FileInputStream;

public class TryWithDemo {
    static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test.txt")) {
            // Use the fis object
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
