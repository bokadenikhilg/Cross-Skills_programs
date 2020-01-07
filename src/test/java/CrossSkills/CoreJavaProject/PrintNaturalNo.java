package CrossSkills.CoreJavaProject;

import java.util.Scanner;

public class PrintNaturalNo {

    public static void main(String[] args) {
        int number, i = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter random Number : ");
        number = sc.nextInt();
        while (i <= number) {
            System.out.print(i + "\t");
            i++;

        }
    }
}
// Same for Whole numbers//