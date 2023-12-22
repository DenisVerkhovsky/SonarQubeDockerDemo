package com.example.sonarqubedockerdemo;

import java.sql.SQLOutput;

public class BugExample {

    void run() throws InterruptedException {
        while (true) {
            System.out.println("Hello Bug!");
            Thread.sleep(5000);
        }
    }
}
