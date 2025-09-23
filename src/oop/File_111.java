package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_111 {
    public static void main(String[] args) {

//        Code to create a new file
/*
        File myFile = new File("File_111.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }

//        Code to write to a file

        try {
            FileWriter fileWriter = new FileWriter("file_111.txt");
            fileWriter.write("This is our first file from this java course\n Ok now bye");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        //Reading a file
        File myFile = new File("File_111.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        */
        File myFile = new File("File_111.txt");
        if (myFile.delete()){
            System.out.println("I have deleted : " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
