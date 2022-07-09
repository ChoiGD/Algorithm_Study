package org.choigd.study2;

/*
SortingAlgorithms(정렬 알고리즘)
1. 정렬이 프로그래밍에서 정말로 흔하게 사용되기 떄문
2. 각각 용도에 알맞는 정렬들이 있고 각각의 장단점이 있음

기본 내장 정렬 함수(.sort)
문자열로 받아드리기 때문에 숫자를 정렬하려면 따로 설정 해주어야 한다
(유니코드로 받아드리기 때문에 숫자는 제대로 정렬이 되지 않음)

function numSort(num1, num2){
    return num1 - num2
}
arr.sort(numSort)를 실행시키면 숫자도 정렬이 가능하다


Bubble Sort, O(N^2)

function BubbleSort(arr){
    let noSwap;
    for(let i = arr.length; i > 0 ; i--){
        noSwap = true
        for(let j=0; j<i -1; j++){
            if(arr[j]>arr[j+1]){

                let temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                noSwap = false
            }
        }
        if(noSwap){break}
    }

}



Selection Sort, O(N^2)
-엄청 효율적인 정렬은 아니다

function selectionSort(arr){
    for(var i = 0; i < arr.length; i++){
        var lowest = i;
        for(var j = i+1; j < arr.length; j++){
            if(arr[j] < arr[lowest]){
                lowest = j;
            }
        }
        if(i !== lowest){
            //SWAP!
            var temp = arr[i];
            arr[i] = arr[lowest];
            arr[lowest] = temp;
        }
    }
    return arr;
}
Insertion Sort

 */



public class SortingAlgorithms {
}
