package CrossSkills.CoreJavaProject;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        boolean leap = false;
        int Y = sc.nextInt();
        if (Y % 4 == 0) {
            if (Y % 100 == 0) {
                if (Y % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;

        } else
            leap = false;

        if (leap == true) {
            System.out.println(Y + " year is leap year");
        } else {
            System.out.println(Y + " year is not a leap year");
        }
    }

}
