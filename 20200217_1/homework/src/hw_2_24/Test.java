package hw_2_24;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Test {
    public static void main(String[] args)  {

        try {
            BufferedInputStream br = new BufferedInputStream(new FileInputStream("a.txt"));

            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}