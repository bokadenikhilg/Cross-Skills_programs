package CrossSkills.CoreJavaProject;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String arg[]) {

        int n = 0;
        int rn = 0;
        System.out.println("Input your number and press enter: ");

        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        while (n != 0) {
            rn = rn * 10;
            rn = rn + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse of input number is: " + rn);
    }

}
