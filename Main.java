package edu.cscc;

import java.util.Arrays;
import java.util.Scanner;

/*  Tyler Henry
    September 23, 2021
    The purpose of this program is to allow the user to enter six different grocery items
    and for the items to be returned to them in an alphabetized list.
 */
public class Main {

    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        int count = 0;
        //Declaring an array
        String stringArray[];

        //Allocating memory for the array
        stringArray = new String[6];

        //Starting while loop for Array
        while (count < stringArray.length){

            //Asking for user input for building array
            System.out.print("Enter Grocery Item: ");
            String item = input.nextLine();

            //Calling method
            //If Else for analyzing return value of method
            if (isDuplicate(item, stringArray, count)){
                System.out.println("Sorry, item: " + item + " is a duplicate");
            }
            else {
                stringArray[count] = item;
                count ++;
            }

        }

        //Sorting the list

        Arrays.sort(stringArray);
        System.out.println("\r\nYour Grocery List");
        //Starting for loop to print
        for (String items : stringArray) {
            System.out.println(items);}
    }


    /**
     * Check user input for duplicates in array
     * @param item
     * @param list
     * @param listCnt
     * @return boolean true or false for duplicate
     */
    public static boolean isDuplicate(String item, String[] list, int listCnt){

        for (int index = 0; index < listCnt; index++){
            //Starting if statement
            if (list[index].equalsIgnoreCase(item)){
                return true;
            }

        }
        //If the if statement does not return true
        return false;
    }
}