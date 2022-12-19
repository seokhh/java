import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        float[] array = new float[a];
        float high = 0;
        float avr = 0;

        for ( int b = 0;  b < a; b++ ) {
            array[b] = sc.nextInt();
            if (array[b] > high){
                high = array[b];
            }
        }
        for(int c = 0; c < a; c++) {
            avr += (array[c]/high*100) / a;
        }
        System.out.println((double) avr);
    }
}
