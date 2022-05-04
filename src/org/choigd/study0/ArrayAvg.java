package org.choigd.study0;

import java.util.Scanner;
/*
백준1546번
max값 구하기, 임의의 평균값
ex) 수학점수 30, 과학점수 50, 국어점수 70
임의의 수학점수 평균 = 30 / 70 * 100 ...
(30 / 70 * 100) + (50/ 70 * 100) + (70/ 70 *100) / 3 = (30 + 50 + 70) * 100 / 70 / 3
 */
public class ArrayAvg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(!(num <= 1000)){
            return;
        }

        int[] numArr = new int[num];

        for (int i = 0; i < num; i++) {
            numArr[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;
        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] > max){
                max = numArr[i];
            }
            sum += numArr[i];
        }

        System.out.println(sum * 100.0 / max / num);

        

    }
}
