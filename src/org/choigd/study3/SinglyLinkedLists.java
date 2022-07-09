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
    //push 메소드 ( 새로운 노드를 맨 뒤에 추가 )
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
    //pop 메소드 ( 마지막 노드를 제거 )
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
    //shift 메소드 ( 마지막 노드 제거 )
    shift(){
        if(!this.head) return undefined;
        var currentHead = this.head;
        this.head = currentHead.next;
        this.length--;
        if(this.length === 0){
            this.tail = null;
        }
        return currentHead;
    }
    //unshift 메소드 ( 새로운 노드를 맨 앞에 추가 )
    unshift(val){
        var newNode = new Node(val);
        if(!this.head) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
        return this;
    }
    //get 메소드
    get(index){
        if(index < 0 || index >= this.length) return null;
        var counter = 0;
        var current = this.head;
        while(counter !== index){
            current = current.next;
            counter++;
        }
        return current;
    }
    //set 메소드(수정)
    set(index, val){
        var foundNode = this.get(index);
        if(foundNode){
            foundNode.val = val;
            return true;
        }
        return false;
    }
    //insert 메소드(노드의 중간에 추가하기)
    insert(index, val){
        if(index < 0 || index > this.length) return false;
        if(index === this.length) return !!this.push(val);
        if(index === 0) return !!this.unshift(val);

        var newNode = new Node(val);
        var prev = this.get(index - 1);
        var temp = prev.next;
        prev.next = newNode;
        newNode.next = temp;
        this.length++;
        return true;
    }

}


var list = new SinglyLinkedList()
list.push("HELLO")
list.push("GOODBYE")
list.push("!")


*/


public class SinglyLinkedLists {

}
