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
- 정렬이 거의다 되어있을 경우 버블정렬을 선택하는 것이 좋다
- 서로 인접한 두 원소의 대소를 비교하고, 조건에 맞지 않다면 자리를 교환하며 정렬하는 알고리즘

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
- 엄청 효율적인 정렬은 아니다
- 해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘

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
- 2번째 원소부터 시작하여 그 앞의 원소들과 비교하여 삽입할 위치를 지정한 후, 원소를 뒤로 옮기고 지정된 자리에 자료를 삽입하는 알고리즘

function insertionSort(arr){
	var currentVal;
    for(var i = 1; i < arr.length; i++){
        currentVal = arr[i];
        for(var j = i - 1; j >= 0 && arr[j] > currentVal; j--) {
            arr[j+1] = arr[j]
        }
        arr[j+1] = currentVal;
    }
    return arr;
}
 */



public class SortingAlgorithms {
}
