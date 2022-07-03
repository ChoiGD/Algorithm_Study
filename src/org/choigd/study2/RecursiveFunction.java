package org.choigd.study2;
/*
Recursive Function(재귀함수)
- 재귀 : 자기 자신을 호출하는 함수
- 반복문 대신하여서 재귀함수를 사용할 때 코드가 깔끔해진다
- 모든 곳에 사용된다

Call Stack (호출 스택)
- 호출 스택은 자바스크립트의 보이지 않는 곳에서 작동하는 정적 데이터 구조
- 진행중인 함수 위에 함수가 올라감
- 기본 케이스 : 재귀가 끝난 상태

JS코드 문제예시

function power(num1,num2){

    const res = Math.pow(num1,num2)

    return res

}

function factorial(num){

   if(num === 0){return 1}

   return num * factorial(num-1)

}

function productOfArray(arr){

    //곱하기니까 기본값은 1
    let sum = 1;

    for(let i=0; i<arr.length; i++){
        sum *= arr[i]
    }

    return sum
}


function recursiveRange(num){

    if(num === 0){return 0}

   return num + recursiveRange(num-1)
}

 */
public class RecursiveFunction {

}
