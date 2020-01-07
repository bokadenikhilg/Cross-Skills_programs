package CrossSkills.CoreJavaProject;

public class PrintInitials {
    public static void Print1stLetter(String name) {
        int i;

        String[] str;
        str = name.split(" ");
        for (i = 0; i < str.length; i++) {
            // String temp = " ";

            char c = str[i].charAt(0);
            // System.out.println(c + ".");

            if (i == str.length - 1) {
                int last = str[i].length();
                String surname = str[i].substring(0, last);
                System.out.print(surname);

            } else {
                System.out.print(c + ".");
            }

        }
    }

    public static void main(String[] args) {
        String name = "Avul Pakir Jainulabdeen Abdul Kalam";
        Print1stLetter(name);
    }
}
