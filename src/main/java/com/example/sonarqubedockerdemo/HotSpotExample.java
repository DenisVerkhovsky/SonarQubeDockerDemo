package com.example.sonarqubedockerdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermissions;

public class HotSpotExample {

    public boolean isValid(String pin) {
        return pin.matches(readRegex());
    }

    public void setPermissions(String filename) throws IOException {
        File f = new File(filename);
        if(!isValid(filename)) {
            throw new IllegalArgumentException();
        }
        Files.setPosixFilePermissions(f.toPath(), PosixFilePermissions.fromString("rwxrwxr--"));
    }

    String readRegex() {
        try(var file = new FileInputStream("/tmp/regex.txt")) {
            return new String(file.readAllBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
