import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 1000000;
        int min = -1000000;

        int a = sc.nextInt();

        int[] array = new int[a];

        for (int c = 0; c < a; c++){
            array[c]=sc.nextInt();
            if (array[c] < max){
                max = array[c];}
            if (array[c] > min){
                min = array[c];
            }

        }
        System.out.println(max + " " + min);

        }
    }