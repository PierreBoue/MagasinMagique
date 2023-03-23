package com.magasin;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

    private FileWriter fout;
    //private FileReader fin;
    public static final String FILENAME = "testresult.txt";
    TestFileWriter()
    {
        try {
            fout = new FileWriter( FILENAME);
            //fin = new FileReader( FILENAME);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            //throw new RuntimeException(e);
        }
    }
    public void write(String line)
    {
        try {
            fout.write(line + "\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public void close()
    {
        try {
            fout.close();
            //fin.close();
           // offset = 0;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
