package org.choigd.study7;
/*
HashTable(해시 테이블)
키-값으로 데이터를 저장하는 자료구
각각의 key값에 해시함수를 적해 배열의 고유한 index를 생성

해시 함수
임의의 길이의 데이터를 입력받아 일정한 길이의 비트열로 반환 시켜주는 함수
입력값의 길이가 달라도 출력값은 언제나 고정된 길이로 반환
동일한 값이 입력되면 동일한 출력값을 보장

분리 연결법(Separate Chaining)과 개방 주소법(Open Addressing)

JavaDML HashMap vs HashTable의 차이
동기화 지원 여부
병렬 처리를 하면서 자원의 동기화를 고려해야 하는 상황이라면 HashTable을 사용
병렬 처리를 하지 않거나 자원의 동기화를 고려하지 않는 상황이라면 HashMap을 사용

데이터 저장 공간이 아주 크고 해시 함수가 아주 좋은 것일지라도 충돌은 발생할 수 있다
-개별 체이닝(Separate Chaining)
배열이나 연결리스트 등과 같은 것을 활용하여 이중 데이터 구조를 사용하는 것
-직선 탐색법
각 위치에 하나의 데이터만 저장한다는 규칙을 그대로 살려서 지키려고 한다


//해시함수
function hash(key, arrayLen) {
  let total = 0;
  for (let char of key) {
    // map "a" to 1, "b" to 2, "c" to 3, etc.
    let value = char.charCodeAt(0) - 96
    total = (total + value) % arrayLen;
  }
  return total;
}

//개선된 해시함수
function hash(key, arrayLen) {
  let total = 0;
  let WEIRD_PRIME = 31;
  for (let i = 0; i < Math.min(key.length, 100); i++) {
    let char = key[i];
    let value = char.charCodeAt(0) - 96
    total = (total * WEIRD_PRIME + value) % arrayLen;
  }
  return total;
}


class HashTable {
  constructor(size=53){
    this.keyMap = new Array(size);
  }

  _hash(key) {
    let total = 0;
    let WEIRD_PRIME = 31;
    for (let i = 0; i < Math.min(key.length, 100); i++) {
      let char = key[i];
      let value = char.charCodeAt(0) - 96
      total = (total * WEIRD_PRIME + value) % this.keyMap.length;
    }
    return total;
  }
  //Set메소드
  set(key,value){
    let index = this._hash(key);
    if(!this.keyMap[index]){
      this.keyMap[index] = [];
    }
    this.keyMap[index].push([key, value]);
  }
  //Get메소드
  get(key){
    let index = this._hash(key);
    if(this.keyMap[index]){
      for(let i = 0; i < this.keyMap[index].length; i++){
        if(this.keyMap[index][i][0] === key) {
          return this.keyMap[index][i][1]
        }
      }
    }
    return undefined;
  }
}

*/
public class HashTable {
}
