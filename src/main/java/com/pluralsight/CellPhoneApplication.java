package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {
    public static void main(String[] args) {
        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the serial number? ");
        serialNumber = scanner.nextInt();
        scanner.nextLine(); // clears the extra newline after nextInt()
        System.out.println("What model is the phone? ");
        model = scanner.nextLine();
        System.out.println("Who is the carrier? ");
        carrier = scanner.nextLine();
        System.out.println("What is the phone number? ");
        phoneNumber = scanner.nextLine();
        System.out.println("Who is the owner of the phone? ");
        owner = scanner.nextLine();

        // creates a new CellPhone object and stores it in the variable cellPhone
        // sends all user input value to the constructor
        CellPhone cellPhone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);
        printPhoneData(cellPhone);  // creating method for exercise 1 and less messy?
        display (cellPhone);
//        display(cellPhone1);
//        display(cellPhone2);
    }

    public static void display(CellPhone phone) {
        System.out.println(phone.getPhoneNumber());
//        phone.getOwner();
//        phone.getPhoneNumber();

    }

    public static void collectUserInput(){

    }

    public static void printPhoneData(CellPhone cellPhone) {
        // cellPhone.getSerialNumber() means Java goes into that object, reads its serialNumber and returns the value
        System.out.println("\nWhat is the serial number? " + cellPhone.getSerialNumber());
        System.out.println("What model is the phone? " + cellPhone.getModel());
        System.out.println("Who is the carrier? " + cellPhone.getCarrier());
        System.out.println("What is the phone number? " + cellPhone.getPhoneNumber());
        System.out.println("Who is the owner of the phone? " + cellPhone.getOwner());
        System.out.println();
        // (side note for ME: kind of like SQL query with table name cellPhone and .getXYZ is the column in the table)
    }
}

// serialNumber in main() is just a regular local variable
// serialNumber inside CellPhone is part of the object itself