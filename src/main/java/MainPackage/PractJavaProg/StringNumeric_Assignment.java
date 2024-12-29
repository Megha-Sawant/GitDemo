package MainPackage.PractJavaProg;

import java.util.ArrayList;

public class StringNumeric_Assignment {
    public static void main(String args[]) {
        String s = "prince123";
        int sum = 0;
        char c[] = s.toCharArray();
        ArrayList<Integer> a = new ArrayList<>();

        for (char ch : c) {
            if (Character.isDigit(ch)) {


                int c1 = Character.getNumericValue(ch);
                a.add(c1);
                sum = sum + c1;

            }

        }
        System.out.println(sum);
        System.out.println(a);
    }
}
