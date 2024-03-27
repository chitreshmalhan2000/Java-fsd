package Practice_Project17;
import java.io.*;
import java.util.Scanner;
public class Practice_Project17 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        createFile(fileName);
        System.out.println("Enter data to be written in file");
          Scanner sc=new Scanner(System.in);
          String s;
          s=sc.nextLine();
        writeFile(fileName,s);
        String data = readFile(fileName);
        System.out.println("Data read from file: " + data);
        String u;
        System.out.println("Enter data to be update in file");
        u=sc.nextLine();
        updateFile(fileName,u);
        data = readFile(fileName);
        System.out.println("Updated data read from file: " + data);
        deleteFile(fileName);
    }

    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            //e.printStackTrace();
        }
    }

    public static void writeFile(String fileName, String data) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            System.out.println("Data get's written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            //e.printStackTrace();
        }
    }
    public static String readFile(String fileName) {
        StringBuilder data = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            while ((character = reader.read()) != -1) {
                data.append((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            //e.printStackTrace();
        }
        return data.toString();
    }

    public static void updateFile(String fileName, String newData) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(newData);
            writer.close();
            System.out.println("Data get's updated in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
           // e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
