import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = a;
        int c = 0;

        do{
            a = ((a % 10) * 10) + (((a / 10) + (a % 10))%10);
            c++;
        } while(b != a);
        System.out.println(c);
        }
    }