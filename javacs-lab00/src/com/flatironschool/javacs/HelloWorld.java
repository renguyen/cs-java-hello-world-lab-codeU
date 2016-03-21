package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String version = System.getProperty("java.version");
        int versionNumberIndex = version.indexOf(".");
        versionNumberIndex = version.indexOf(".", versionNumberIndex+1);
        return Double.parseDouble(version.substring(0, versionNumberIndex));
    }

    public static void main(String[] args) {
    }
}
