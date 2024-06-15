import java.util.ArrayList;

public class Create_Phone_Number {
    public static String createPhoneNumber(int[] numbers) {
        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i < numbers.length; i++) {
            Integer b = numbers[i];
            if (i == 0) {
                a.add("(");
            }
            if (i == 3) {
                a.add(")");
            }
            if (i == 3) {
                a.add(" ");
            }
            if (i == 7) {
                a.add("-");
            }
            a.add(b.toString());
        }
        String c = String.join("", a);
    return c;
    }
}
