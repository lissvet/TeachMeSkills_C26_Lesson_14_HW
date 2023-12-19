package com.teachmeskills.lesson14;
import com.teachmeskills.lesson14.service.Logger;
import com.teachmeskills.lesson14.service.ValidDocNumber;
import java.util.Date;
import java.util.Scanner;
/**There is a file with document numbers.
 * The document number is a string consisting of letters and numbers (no service characters).
 * This file contains each document number on a new line and no other information in the line, only the document number.
 * A valid document number must be 15 characters long and start with the sequence:
 * docnum (followed by any sequence of letters/digits) or soptgast (followed by any sequence of letters/digits).
 * Write a program to read information from the input file - the path to the input file should be set through the console.
 * The program should check document numbers for validity.
 * Valid docnum document numbers should be recorded in one report file.
 * Valid soptgast contract numbers should be written to another report file.
 * Errors, if they occur, should be written to the error_log.txt file
 * Logs should be written to the file execution_log.txt
 * Invalid document numbers should be written to another report file, but after the document numbers you should add information about why this document is invalid
 * (wrong sequence of characters at the beginning/ there are service characters in the document name, etc.).*/
public class Runner {

    public static void main(String[] args) {
        Logger.logInfo(new Date()," -> Start program.\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the path to the document with document numbers:");
        String docNumFilesPath = scan.nextLine();
        Logger.logInfo(new Date(), "-> Reading file path via console.\n");

        try {
            ValidDocNumber.checkDocNumber(docNumFilesPath);
        } catch (Exception e) {
            Logger.logErrorInfo(new Date(), " -> Unexpected error.\n");
        }

        Logger.logInfo(new Date()," -> End program.\n");
    }

}
