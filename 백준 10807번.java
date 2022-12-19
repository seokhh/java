import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] array = new int[a];
        int b = 0;

        for (int c = 0; c < a; c++){
            array[c]=sc.nextInt();
        }

        int d = sc.nextInt();
        for (int e = 0; e < array.length; e++) {
            if (d == array[e]) {
                b++;}
        }
        System.out.println(b);

    }
}