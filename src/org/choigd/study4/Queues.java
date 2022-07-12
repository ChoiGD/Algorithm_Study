package org.choigd.study4;
/*
Queues
- 선입선출, FIFO 자료구조, 먼저 들어간것이 먼저 나온다
- Background tasks
- Uploading resources
- Printing / Task processing

배열 + 클래스로 구성 가능
배열
- pop, unshift

클래스

class Node{
    constructor(value){
        this.value = value;
        this.next =null;
    }

}

class Queue{
    constructor(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    enqueue(val){
        var newNode = new Node(val);
        if(!this.first){
            this.first = newNode;
            this.last = newNode;
        }else {
            this.last.next = newNode;
            this.last = newNode;
        }
        return ++this.size;
    }
    dequeue(){
        if(!this.first) return null;

        var temp = this.first;
        if(this.first === this.last){
            this.last = null;
        }
        this.first = this.first.next;
        this.size--;
        return temp.value;
    }
}



 */
public class Queues {
}
