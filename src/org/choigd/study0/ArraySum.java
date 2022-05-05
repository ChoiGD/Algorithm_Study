package org.choigd.study0;

import java.util.Scanner;
/*
백준 11659번
수 N개가 주어졌을 때 i 번째 수에서 j번째 수까지의 합을 구하는 프로그램을 작성하시오
 */
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n개의 숫자
        int nNum = sc.nextInt();
        //질의 개수
        int qNum = sc.nextInt();
        //n개의 숫자 배열의 합
        int[] sumArr = new int[nNum+1];

        for (int i = 1; i < sumArr.length; i++) {
            sumArr[i] = sumArr[i -1] + sc.nextInt();
        }

        for (int j = 0; j < qNum; j++) {
            int iNum = sc.nextInt();
            int jNum = sc.nextInt();
            System.out.println(sumArr[jNum] - sumArr[iNum -1]);
        }


    }
}
