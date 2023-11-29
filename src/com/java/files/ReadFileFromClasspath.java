package com.java.files;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;

public class ReadFileFromClasspath {
    public static void main(String[] args) throws Exception {
        //To avoid referring non-static method inside main() static method
        ReadFileFromClasspath instance = new ReadFileFromClasspath();

        File file = instance.getFile("D:\\Projects\\Java\\PrimitiveDataTypes\\src\\main\\resources\\demo.txt");

        //validate file path
        System.out.println(file.getPath());

        //Read file
        List<String> lines = Files.readAllLines(file.toPath());

        System.out.println(lines);
    }

    private File getFile(String fileName) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);

        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }
    }
}