import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a * 60 + b + c;

        if (d > 1440) {
            d = d - 1440;
            System.out.println(d / 60 + " " + d % 60);
            }
        else if (d < 1440) {
            System.out.println(d / 60 + " " + d % 60);
        }
        else {
            System.out.println("0" +" "+ "0");
        }

    }
}