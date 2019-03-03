package pl.saltsoft;

import java.io.*;

public class SundayF {
    void readLinesFromFile(String filePath) throws Exception {
        File file = new File(filePath);
        FileReader r = new FileReader(file);
        BufferedReader br = new BufferedReader(r);
        String st = br.readLine();
        while (st != null) {
            System.out.println(st);
            st = br.readLine();
        }
    }

    public void writeLinesFromFile(String filePath) throws Exception {
        File file = new File(filePath);
        FileWriter r = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(r);

        br.write("Hello World");
        br.newLine();
        br.flush();
        br.close();
    }

}

