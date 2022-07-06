package org.choigd.study2;

/*
Merge Sort, O(N log N)
목표는 배열을 계속 반으로 나누는 것, slice, 배열의 길이가 1보다 작거나 같아야한다
작은 요소로 나눈다음 합병을 해야한다.

//두개의 배열을 합병하는 메소드, 정렬하면서 합병한다.
function merge(arr1, arr2){
    let results = [];
    let i = 0;
    let j = 0;
    while(i < arr1.length && j < arr2.length){
        if(arr2[j] > arr1[i]){
            results.push(arr1[i]);
            i++;
        } else {
            results.push(arr2[j])
            j++;
        }
    }

    //길이에 맞춰 배열에 넣어주고 남은 것들을 넣어준다
    while(i < arr1.length) {
        results.push(arr1[i])
        i++;
    }
    while(j < arr2.length) {
        results.push(arr2[j])
        j++;
    }
    return results;
}

//재귀와 slice를 사용하여 배열을 분리하고 머지메소드를 사용하여 정렬한다.
function mergeSort(arr){
    if(arr.length <= 1) return arr;
    let mid = Math.floor(arr.length/2);
    let left = mergeSort(arr.slice(0,mid));
    let right = mergeSort(arr.slice(mid));
    return merge(left, sright);
}


, Quick Sort, Radix Sort


*/

public class SortingAlgorithms2 {
}
