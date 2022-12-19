import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int a = 0;
        int count = 0;

        for ( int b = 0; b < 10; b++ ) {
            array[b] = scanner.nextInt() % 42;
        }
        for ( int c = 0; c < 10; c++ ) {
            a = 0;
            for ( int d = c+1; d < 10; d++ ) {
                if ( array[c] == array[d] ) {
                    a ++;
                }
            }
            if ( a == 0 ) {
                count ++;
            }
        }
        System.out.println(count);
    }
}