package Baekjoon.problem.no4344;
import java.util.Arrays;
import java.util.Scanner;

public class MaybeOverAvg {
    public static void main(String[] args){
        int sum = 0;
        double avg;
        int avgOver = 0;
        int sub;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.print("케이스 개수를 입력하세요: ");
        int newcase = sc.nextInt();
        for(int i =0; i<newcase; i++){
            System.out.print("점수 개수를 입력하세요: ");
            sub = sc.nextInt();
            int[] arr = new int[sub];
            System.out.print("점수를 입력해주세요: ");
            for(int k = 0; k<sub; k++){
                arr[k] = sc.nextInt();
                sum += arr[k];
            }
            avg = (double) (sum) /sub;
            for(int j = 0; j<sub; j++) {
                if (arr[j] > avg) {
                    avgOver ++;
                }
            }
            b = (double) avgOver /sub * 100;
            sum = 0;
            avgOver = 0;
            System.out.print("평균 넘는 학생의 비율: ");
            System.out.println(String.format("%.3f", b));
        }
    }
}