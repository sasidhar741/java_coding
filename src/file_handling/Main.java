package file_handling;

import java.io.*;

public class Main {
    //Byte Stream and Character stream
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("outfile.txt");
             FileInputStream fileInputStream = new FileInputStream("infile.txt");
             Reader readFile = new FileReader("infileText.txt");
             Writer writeFile = new FileWriter("outfileText.txt");) {
            int value = fileInputStream.read();

            while (value != -1) {
                fileOutputStream.write(value);
                value = fileInputStream.read();
            }

            int textFileReadValue = readFile.read();
            while (textFileReadValue != -1) {
                writeFile.write(textFileReadValue);
                textFileReadValue = readFile.read();
            }
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
