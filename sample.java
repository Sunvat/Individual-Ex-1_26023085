import java.util.*;
public class sample {
    public static void sumOfDigits() {
        Scanner in = new Scanner(System.in);
        int a, s = 0, g;
        System.out.println("ENTER AN INTEGER BETWEEN 0 AND 1000");
        a = in.nextInt();//takes an input from the user
        while (a != 0) {
            g = a % 10;
            s = s + g;
            a = a / 10;
        }
        System.out.println("SUM OF DIGITS : " + s);

    }
    public static void OddEven() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
	int a = in.nextInt();
	if(a%2 == 0) {
		System.out.println("Number is Even");
	}
	else {
		System.out.println("Number is odd");
	}
    }
}

