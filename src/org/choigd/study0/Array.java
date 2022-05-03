package org.choigd.study0;

import java.util.Arrays;
import java.util.Scanner;

/*
    N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오

*/
public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(!(num >0 && num <101)){
            return;
        }
        String[] arr = new String[num];

        String sNum = scanner.next();

        arr = sNum.split("");

        if(!(num == arr.length)){
            return;
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum +=Integer.parseInt(arr[i]);
        }

        System.out.println("sum = " + sum);


        
    }
}
