package CrossSkills.CoreJavaProject;

import java.util.Scanner;

public class TriangleType {

    public static void main(String[] args) {
        System.out.println("Enter length of sides of triangle:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("Equilateral Triangle");

        else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a))
            System.out.println("Isosceles Triangle");

        else if (a != b && b != c && c != a)
            System.out.println("Scalene Triangle");
    }
}
