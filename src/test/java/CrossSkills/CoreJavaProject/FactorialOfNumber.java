package CrossSkills.CoreJavaProject;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String arg[]) {

        int fact = 1;
        int i = 1, num;

        System.out.println("Input your number and press enter: ");

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        while (i <= num) {

            fact = fact * i;
            i++;

        }
        System.out.println(fact);

    }

}
