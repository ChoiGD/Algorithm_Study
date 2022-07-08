package org.choigd.study3;

/*
SinglyLinkedLists(연결리스트)
-각각의 엘리먼트를 "노드"
-head(시작), tail(끝), length(길이)
ex)5층을 가기위해서 1층부터 가야한다 => 오직 단일 방향으로만 연결 되어있다
Lists vs Arrays
-Lists에는 인덱스가 없다
-위치도 필요없다,("열번째 항목이 필요할 경우 바로 그 값을 얻을 수 없다)"

class Node{
    constructor(val){
        this.val = val;
        this.next = null;
    }
}

class SinglyLinkedList{
    constructor(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    //push 메소드
    push(val){
        var newNode = new Node(val);
        if(!this.head){
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
        return this;
    }
    //pop 메소드
    pop(){
        if(!this.head) return undefined;
        var current = this.head;
        var newTail = current;
        while(current.next){
            newTail = current;
            current = current.next;
        }
        this.tail = newTail;
        this.tail.next = null;
        this.length--;
        if(this.length === 0){
            this.head = null;
            this.tail = null;
        }
        return current;

    }
}


var list = new SinglyLinkedList()
list.push("HELLO")
list.push("GOODBYE")
list.push("!")


*/


public class SinglyLinkedLists {

}
