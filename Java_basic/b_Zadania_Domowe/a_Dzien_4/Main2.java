package b_Zadania_Domowe.a_Dzien_4;


import java.io.*;

public class Main2 {

    public static void main(String[] args) {

        System.out.println(count("/home/przemysaw/Pulpit/test/skad2.txt"));

    }

    static int count(String fileName) {
        int counter = 0;
        File file = new File(fileName);
        try {
            FileInputStream fileStream = new FileInputStream(file);
            InputStreamReader input = new InputStreamReader(fileStream);
            BufferedReader reader = new BufferedReader(input);
            String line;

            while ((line = reader.readLine()) != null) {
                if (!(line.equals(""))) {
                    String[] wordList = line.split("\\s+"); // \\s+ is the space delimiter in java
                    counter += wordList.length;
                }
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        return counter;
    }
}
