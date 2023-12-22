package com.example.sonarqubedockerdemo;

public class DuplicationExample {

    public static class CopyPaste1 {
        private final String name;
        private final String description;

        public CopyPaste1(String name, String description) {
            this.name = name;
            this.description = description;
        }
    }

    public static class CopyPaste2 {
        private final String name;
        private final String description;

        public CopyPaste2(String name, String description) {
            this.name = name;
            this.description = description;
        }
    }
}
