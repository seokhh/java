import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int b = 0; b < a; b++){
            for(int c = 0; c < a - b - 1; c++) {
                System.out.print(" ");
            }
            for (int c = 0; c <= b; ++c) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}