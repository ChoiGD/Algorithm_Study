package org.choigd.study6;
/*

Heap(힙) or Binary Heaps(이진 힙)
-최댓값 및 최솟값을 찾아내는 연산을 빠르게 하기 위해 고안된 완전 이진트리를 기본으로 한 자료구조
1. 완전 이진트리(Complete Binary Tree)
2. 부모노드의 키값과 자식노드의 키값 사이에는 대소관계가 성립
    2-1. 키값 대소관계는 오로지 부모자식 간에만 성립, 형제사이에는 대소관계까 정해지지 않음

class MaxBinaryHeap {
    constructor(){
        this.values = [];
    }
    //추가 메소드
    insert(element){
        this.values.push(element);
        this.bubbleUp();
    }

    bubbleUp(){
        let idx = this.values.length - 1;
        const element = this.values[idx];
        while(idx > 0){
            let parentIdx = Math.floor((idx - 1)/2);
            let parent = this.values[parentIdx];
            if(element <= parent) break;
            this.values[parentIdx] = element;
            this.values[idx] = parent;
            idx = parentIdx;
        }
    }
}
let heap = new MaxBinaryHeap();
 */

public class Heaps {
}
