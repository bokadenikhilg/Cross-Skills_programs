package CrossSkills.CoreJavaProject;

import java.util.Scanner;

public class DivisibleByNo {
    public static void main(String args[]) {

        // int a = 25, b = 89;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = num.nextInt();

        if (N % 5 == 0) {
            System.out.println("Number " + N + " is divisible by 5");
        } else {
            System.out.println("Number " + N + " is not divisible by 5");
        }
    }
}
