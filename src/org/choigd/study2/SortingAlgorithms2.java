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

Radix Sort(기수 정렬)
비교 알고리즘이 아닌 정렬 알고리즘, 직접 비교하지 않는다 => 다른 방식으로 데이터를 처리
숫자로 진행된다 => 이진수, ex) 숫자의 크기에 대한 정보를 자릿수로 인코 네자리수 > 두자리수 (가장 오른쪽에 잇는 수)
1. 자릿수 알아내(수, 위치) => 그 위치의 숫자를 반환

function getDigit(num, i) {
    return Math.floor(Math.abs(num) / Math.pow(10, i)) % 10
}

2. 수에 자릿수가 얼마나 되는지 알아내는 것 => 버킷에 몇번 넣어야하는지 알아내기 위함, 가장 큰 숫자에 자릿수가 얼마나 되는지 알아내기

function digitCount(num){
    if(num === 0) return 1
    return Math.floor(Math.log10(Math.abs(num))) + 1
}

3. 기수 정렬

function radixSort(nums){
    let maxDigitCount = mostDigits(nums);
    for(let k = 0; k < maxDigitCount; k++){
        let digitBuckets = Array.from({length: 10}, () => []);
        for(let i = 0; i < nums.length; i++){
            let digit = getDigit(nums[i],k);
            digitBuckets[digit].push(nums[i]);
        }
        nums = [].concat(...digitBuckets);
    }
    return nums;
}

*/

public class SortingAlgorithms2 {
}
