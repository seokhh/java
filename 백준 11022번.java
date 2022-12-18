import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int sum = 0;

        for (int a = 1; a <= t; a++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            sum = b + c;
            System.out.println("Case #" + a + ": "+ b + " + " + c + " = " + sum);
        }

    }
}