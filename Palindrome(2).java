package Baekjoon.problem.no10988;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요: ");
        String word = sc.next();
        String[] arr = new String[]{word};
        /*String[] arr = new String[word.length()];
        for(int i = 0; i<word.length(); i++){
            arr[i] = sc.next();
        }*/
        if(word.length() % 2 == 0){
        for(int i = 0; i<word.length() / 2; i++){
            if(arr[i].equals(arr[arr.length-(1+i)])){
                    System.out.println("1");
                } else{
                System.out.println("0");
            }
            }
        } else {
            for(int i = 0; i<(word.length() / 2) + 1; i++){
                if(arr[i].equals(arr[arr.length-(1+i)])){
                    System.out.println("1");
                } else{
                    System.out.println("0");
                }
            }
        }
    }
}