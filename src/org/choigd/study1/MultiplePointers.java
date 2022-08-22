package org.choigd.study1;

/*
MultiplePointers (다중포인터 패턴)

-배열의 인덱스를 사용한다. 왼쪽, 오른쪽 두개의 포인터를 사용하는 패턴
-2개 또는 그 이상의 포인터를 두고 값들을 비교하여 문제를 해결하는 알고리즘 패턴


JS Code

function countUniqueValues(arr){
  //arr 0일경우
  if(arr.length === 0){
      return 0;
  }
  // 중복값을 담을 변수
 var num = 0;

 for(var j =1; j<arr.length; j++){
    if(arr[num] !== arr[j]){
        num++;
        arr[num] = arr[j];
    }
 }
  return num + 1;

}

 */


public class MultiplePointers {

    public int countUniqueValues(int[] arr){
        //arr 0일경우
        if(arr.length == 0){
            return 0;
        }
        // 중복값을 담을 변수
        var num = 0;

        for(var j =1; j<arr.length; j++){
            if(arr[num] != arr[j]){
                num++;
                arr[num] = arr[j];
            }
        }
        return num + 1;

    };


    public static void main(String[] args) {
        //변경점 arr을 sort로 작은숫자부터 정렬하여서 시도하자
        int[] arr = {1,2,3,4,4,7,7,12,12,13};

        int num = 0;

        if(arr.length == 0){
            num = 0;
        }

        for (int j = 1; j < arr.length; j++) {
            if(arr[num] !=arr[j]){
                num++;
                arr[num] = arr[j];
            }
        }
        num +=1;
        System.out.println(num);

    }
}
