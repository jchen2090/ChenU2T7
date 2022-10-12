import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1;
        String str2;
        String firstHalf;
        String secondHalf;
        int len1;
        int len2;


        System.out.print("Enter first string: ");
        str1 = input.nextLine();

        // Finds out length of string and first/second half
        len1 = str1.length();
        firstHalf = str1.substring(0, len1 / 2);
        secondHalf = str1.substring(len1 / 2);

        System.out.println(
                "\nLength of string: " + len1
                + "\nFirst half: " + firstHalf
                + "\nSecond half: " + secondHalf
        );

        System.out.print("\nEnter second string: ");
        str2 = input.nextLine();

        len2 = str2.length();

        // Checks which string is longer
        if (len1 > len2) {
            System.out.println(str1 + " is longer");
        }
        else if (len2 > len1) {
            System.out.println(str2 + " is longer");
        }
        else {
            System.out.println("Both strings have the same length");
        }


        // Checks which one is first alphabetically
        if (str1.equals(str2)) {
            System.out.println("Both strings have the exact same characters");
        }
        else if (str1.compareTo(str2) > 0) {
            System.out.println(str2 + " is first alphabetically");
        }
        else {
            System.out.println(str1 + " is first alphabetically");
        }

        // Checks if string 2 is in string 1
        if  (str1.indexOf(str2) != -1) {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        }
        else {
            System.out.println(str2 + " is NOT found in " + str1);
        }



    }
}
