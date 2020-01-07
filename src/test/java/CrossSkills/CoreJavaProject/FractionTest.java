package CrossSkills.CoreJavaProject;

public class FractionTest {
    public static void main(String[] args) {

        int n = 2;
        int d = 3;

        FractionCalculator obj1;
        obj1 = new FractionCalculator();
        obj1.printequivalentFraction(n, d);

    }
}

class FractionCalculator {

    public void printequivalentFraction(int num, int deno) {

        int quotient = num / deno;
        if (quotient == 0) {
            System.out.println(num / deno + ":is equivalent fraction");
        } else {
            System.out.println(num / deno + ":is Not equivalent fraction");
        }
    }
}
