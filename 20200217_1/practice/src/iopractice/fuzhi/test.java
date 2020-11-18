package iopractice.fuzhi;

import java.io.*;

public class test {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader("copy.txt");
             BufferedReader br = new BufferedReader(fr);

             FileWriter fw=new FileWriter(("copy_1.txt"));
             BufferedWriter bw=new BufferedWriter(fw);
        ) {
            String len=null;
            while ((len=br.readLine())!=null){

                System.out.println(len);

                bw.write(len);
                bw.newLine();
                bw.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}