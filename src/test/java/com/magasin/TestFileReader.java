package com.magasin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    BufferedReader reader;
    public TestFileReader()
    {
        try {
            reader = new BufferedReader(new FileReader(TestFileWriter.FILENAME));
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    public String readLine()
    {
        String line= null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return line;
    }
    public void close()
    {
        try {
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
