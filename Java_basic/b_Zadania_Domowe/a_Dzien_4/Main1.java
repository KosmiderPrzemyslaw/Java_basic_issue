package b_Zadania_Domowe.a_Dzien_4;


import java.io.*;

public class Main1 {

    public static void main(String[] args) {
        System.out.println(count("/home/przemysaw/Pulpit/test/skad2.txt"));

    }

    static int count(String filePath) {
        int count = 0;
        String data;
        File file = new File(filePath);
        BufferedReader reader = null;
        try {
            FileInputStream fileStream = new FileInputStream(file);
            InputStreamReader input = new InputStreamReader(fileStream);
            reader = new BufferedReader(input);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            while ((data = reader.readLine()) != null) {
                count += data.length();

            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        return count;
    }
}

