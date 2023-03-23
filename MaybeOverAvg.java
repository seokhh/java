package Baekjoon.problem.no4344;

import java.util.Scanner;

public class MaybeOverAvg {
    public static void main(String[] args){
        int sum = 0;
        double avg = 0;
        int score = 0;
        int avgOver = 0;
        int sub;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.print("케이스 개수를 입력하세요: ");
        int newcase = sc.nextInt();
        for(int i =0; i<newcase; i++){
            System.out.print("점수 개수를 입력하세요: ");
            sub = sc.nextInt();
            System.out.print("점수를 입력해주세요: ");
            for(int k = 0; k<sub; k++){
                score = sc.nextInt();
                sum += score;

            }
            avg = (double) (sum) /sub;
            for(int j = 0; j<sub; j++) {
                if (score > avg) {
                    avgOver++;
                }
            } //숫자 하나당 평균 넘는 학생 수가 올라가야하는데 아직 어떻게 해야할지 감이 안옴
            // avg를 for문 안에 쓰면 모든 값이 적용됨
            b = (double) (avgOver / sub)*100;
            System.out.println(sub);
            System.out.println(avg);
            System.out.println(b);
            System.out.println(avgOver);
            System.out.print("평균 넘는 학생의 비율: ");
            System.out.println(String.format("%.3f", b));
        }
    }
}