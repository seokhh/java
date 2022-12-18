import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;

        for (int b = 1; b <= a; b++) {
            sum += b;
        }
        System.out.println(sum);

    }
}