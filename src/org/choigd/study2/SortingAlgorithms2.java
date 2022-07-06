package org.choigd.study2;

/*
Merge Sort(합병 정렬), O(N log N)
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

Quick Sort(퀵 정렬)
배열에 0개 또는 1개의 항목이 남을 때까지 분할하여 개별적으로 정렬되는 방식,
피벗 포인트라는 단일 요소, 중앙의 요소
해당 요소보다 작은 숫자를 왼쪽으로 옮기고 큰숫자를 오른쪽으로 옮긴다 => 반복


function pivot(arr, start = 0, end = arr.length - 1) {
  const swap = (arr, idx1, idx2) => {
    [arr[idx1], arr[idx2]] = [arr[idx2], arr[idx1]];
  };

  // We are assuming the pivot is always the first element
  let pivot = arr[start];
  let swapIdx = start;

  for (let i = start + 1; i <= end; i++) {
    if (pivot > arr[i]) {
      swapIdx++;
      swap(arr, swapIdx, i);
    }
  }

  // Swap the pivot from the start the swapPoint
  swap(arr, start, swapIdx);
  return swapIdx;
}


function quickSort(arr, left = 0, right = arr.length -1){
    if(left < right){
        let pivotIndex = pivot(arr, left, right) //3
        //left
        quickSort(arr,left,pivotIndex-1);
        //right
        quickSort(arr,pivotIndex+1,right);
      }
     return arr;
}

Radix Sort


*/

public class SortingAlgorithms2 {
}
