package CrossSkills.CoreJavaProject;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] arg) {

        int num, i = 1, table;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter random Number : ");
        num = sc.nextInt();

        while (i <= 10) {

            table = num * i;
            System.out.print(table + "\t");
            i++;
        }

    }
}
