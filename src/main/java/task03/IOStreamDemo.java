/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task03;

/**
 *
 * @author TripleA679
 */
import java.io.*;
import java.util.Scanner;

public class IOStreamDemo {
    private static final String TEXT_FILE = "ColourMatch.txt";

    public static void writeTextFile() {
        try {
            // Prompt for the user's favorite sporting team
            System.out.print("Enter your favorite sporting team: ");
            Scanner scanner = new Scanner(System.in);
            String sportTeam = scanner.nextLine();

            // Prompt for the user's favorite color
            System.out.print("Enter your favorite color: ");
            String color = scanner.nextLine();

            // Append the information to the text file
            FileWriter fileWriter = new FileWriter(TEXT_FILE, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(color + " " + sportTeam);
            printWriter.close();

            System.out.println("Data saved to " + TEXT_FILE);
        } catch (FileNotFoundException e) {
            System.out.println("Error accessing the file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    public static void readTextFile() {
        try {
            // Read and display the contents of the text file
            FileReader fileReader = new FileReader(TEXT_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("Contents of " + TEXT_FILE + ":");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error accessing the file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        writeTextFile();
        System.out.println();
        readTextFile();
    }
}
