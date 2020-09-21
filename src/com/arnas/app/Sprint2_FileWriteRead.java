package com.arnas.app;

import java.io.*;
import java.util.Scanner;

public class Sprint2_FileWriteRead {

    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);
        int choice = 9;

        while (choice != 0) {

            System.out.println("> Choose what you want to do:\n" +
                    "1) Create new employee data.\n" +
                    "2) Create new visitor data.\n" +
                    "3) Read data from file.\n" +
                    "\n" +
                    "0) Quit program.");
            choice = Integer.parseInt(userChoice.nextLine());

            switch (choice) {
                case 1:
                    newEmployee(); // creates object called: employee
                    break;
                case 2:
                    newVisitor(); // creates object called: visitor
                    break;
                //case 3:
                //    readFile(); // reads data currently stored in the file
                case 0:
                    break;
                default:
                    System.err.println("> Please choose one of the options above!");
                    break;
            }
        }

        System.out.println("> End of program...");

        // File to write data to / read data from
        File newFile = new File("./duomenys.csv");

        // Rašymas į failą
        //BufferedWriter fileWrite = null;
        //try {
        //    fileWrite = new BufferedWriter(new FileWriter(newFile, true));
        //    System.out.println(" smth smth");
        //    String input = userInput.nextLine();
        //    while(!input.equals("quit")) {
        //        fileWrite.write(input + "\n");
        //        input = userInput.nextLine();
        //    }
        //    fileWrite.close();
        //
        //} catch (IOException e) {
        //    System.err.println(e.getMessage());
        //}

        // Failo skaitymas ir atvaizdavimas konsolėje
    }

    public static void newEmployee() {
        // Collecting console input
        Scanner userInput = new Scanner(System.in);
        System.out.println("> Data about the new employee: ");
        System.out.println("... Enter the person's name: ");
        String eName = userInput.nextLine();
        System.out.println("... Enter the person's last name: ");
        String eLastName = userInput.nextLine();
        System.out.println("... Enter the person's age: ");
        int eAge = Integer.parseInt(userInput.nextLine());
        System.out.println("... Enter the person's position: ");
        String ePosition = userInput.nextLine();
        System.out.println("... Enter the person's years working here: ");
        double eWorkYears = Double.parseDouble(userInput.nextLine());

        Employee employee = new Employee(eName, eLastName, eAge, ePosition, eWorkYears);
    }

    public static void newVisitor() {
            // Collecting console input
            Scanner userInput = new Scanner(System.in);
            System.out.println("> Data about the visitor: ");
            System.out.println("... Enter the visitor's name: ");
            String vName = userInput.nextLine();
            System.out.println("... Enter the visitor's last name: ");
            String vLastName = userInput.nextLine();
            System.out.println("... Enter the visitor's age: ");
            int vAge = Integer.parseInt(userInput.nextLine());
            System.out.println("... Enter the visitor's intent of visit: ");
            String vIntent = userInput.nextLine();
            System.out.println("... Enter the visitor's duration of visit: ");
            int vDuration = Integer.parseInt(userInput.nextLine());

            Employee visitor = new Employee(vName, vLastName, vAge, vIntent, vDuration);
    }

}
