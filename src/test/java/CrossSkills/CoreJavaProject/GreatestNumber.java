package CrossSkills.CoreJavaProject;

public class GreatestNumber {
    public static void main(String args[]) {
        int a = 45;
        int b = 30;
        int c = 40;
        int d = 4;

        if (a > b && a > c && a > d) {

            System.out.println("a is greater:" + a);
        } else if (b > c && b > d) {

            System.out.println("b is greater:" + b);
        } else if (c > d) {
            System.out.println("c is greater:" + c);
        } else {
            System.out.println("d is greater:" + d);
        }

    }
}
