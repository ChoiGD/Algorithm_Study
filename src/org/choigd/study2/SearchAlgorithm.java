package org.choigd.study2;

/*
Search Algorithm(검색 알고리즘)

1. Linear Search(선형 검색) O(1), O(N)
첫 부분에서 시작해서 끝부분으로 이동하면서 한번에 하나의 항목을 확인할 수 도 있다.
 -indexOf
 -includes
 -find
 -findIndex

function linearSearch(arr, num){
  //기본적 선형 구조

  let idx = -1
  for(let i=0; i<arr.length; i++){
      if(arr[i] === num){
          idx = i
      }
  }
  return idx

}


2. Binary Search(이진 검색) O(log n), O(1)
좌측, 우측 데이터를 분리하여서 검색을 진행, 시작, 끝, 평균값을 이용해서 처리한다
주의점 : 정렬이 되어있어야 가능하다

function binarySearch(arr, num){

  let start = 0
  let end = arr.length - 1
  let middle = Math.floor((start + end) / 2)

  while(arr[middle] !== num && start <= end){

      if(num < arr[middle]){
          end = middle - 1
      }else{
          start = middle + 1
      }
      middle = Math.floor((start + end) / 2)
  }
  if(arr[middle] === num){
      return middle
  }
  return -1

}

3. Naive String Search
긴문자열을 반복하는, 짤은 문자열은 반복하는 식이 필요, 카운트도 필요
이중반복문!
*/


public class SearchAlgorithm {
}
