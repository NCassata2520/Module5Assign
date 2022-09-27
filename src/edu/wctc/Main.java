package edu.wctc;

import java.sql.Driver;
import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = input.next();
        System.out.println("Enter middle initial: ");
        String middleIn = input.next();
        System.out.println("Enter last name: ");
        String lastName = input.next();
        System.out.println("Enter year of birth: ");
        int yearBirth = input.nextInt();
        System.out.println("Enter month of birth: ");
        String monthBirth = input.next();
        System.out.println("Enter day of birth: ");
        int dayBirth = input.nextInt();
        DriversLicense first = new DriversLicense();
        firstName = first.setSSSS();
        DriversLicense middle = new DriversLicense();
        middleIn = middle.setFFF();
        DriversLicense last = new DriversLicense();
        lastName = last.setSSSS();
        DriversLicense year = new DriversLicense();
        yearBirth = year.setYY();
        DriversLicense month = new DriversLicense();
        monthBirth = month.setDDD();
        DriversLicense day =  new DriversLicense();
        dayBirth = day.setDDD();

        try{
            new DriversLicense();
            new FirstNameUtility();
            new LastNameUtility();
            new MonthDayGenderUtility();


        } catch (Exception  e){
            System.out.println(Exception);

        }
        System.out.println(DriversLicenseFormatter);
    }
}
