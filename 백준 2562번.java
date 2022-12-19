import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 9;
        int max = 0;
        int turn = 0;
        int[] array = new int[a];
        for (int c = 0; c < a; c++){
            array[c]=sc.nextInt();
        }
        for (int b = 0; b < a; b++){
            if (array[b] > max){
                max = array[b];
                turn = b+1;
            }
        }
        System.out.println(max);
        System.out.println(turn);
    }
}