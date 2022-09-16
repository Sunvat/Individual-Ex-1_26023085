import java.util.*;
public class sample {
    public static void sumOfDigits() {
        Scanner in = new Scanner(System.in);
        int a, s = 0, g;
        System.out.println("ENTER AN INTEGER BETWEEN 0 AND 1000");
        a = in.nextInt();
        while (a != 0) {
            g = a % 10;
            s = s + g;
            a = a / 10;
        }
        System.out.println("SUM OF DIGITS : " + s);

    }
}

