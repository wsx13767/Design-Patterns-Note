package com.siang.note.customIO;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream is = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("text.txt")));
            while ((c = is.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
