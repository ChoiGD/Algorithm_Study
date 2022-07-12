package org.choigd.study4;
/*
Stack(스택)
- 후입선출, LIFO의 자료구조
- 가장 나중에 추가 된 것이 먼저 삭제 된다.
- 함수 호출을 다루는 상황에서 사용되는 것
- Undo / Redo [ex) 컨트롤 + z, 실행 취소]
- Routing (the history object)

배열도 스택을 사용할 수 있다.
가장 먼저 추가된 것이 가장 나중에 제거되고, 가장 나중에 추가된 것이 가장 먼저 제거되도록 하려면
push, pop, unshift, shift를 이용하자

단일 연결 리스트 스택 구성
- Stack 클래스 정의
- 데이터를 저장하는 방식
- 상수 값의 시간을 갖는다

class Node {
    constructor(value){
        this.value = value;
        this.next = null;
    }
}

class Stack {
    constructor(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    //push 메소드
    push(val) {
        var newNode = new Node(val);
        if(!this.first){
            this.first = newNode;
            this.last = newNode;
        }else{
            var temp = this.first;
            this.first = newNode;
            this.first.next = temp;
        }
        return ++this.size;
    }


}


 */
public class Stack {
}
