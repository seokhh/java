import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] array = new int[a];


        for (int c = 0; c < a; c++){
            array[c]=sc.nextInt();
            if (b > array[c]) {
                System.out.print(array[c] +" ");
            }
        }
    }
}