package org.choigd.study5;
/*
중요

Trees(이진 검색 트리)
- 연결 리스트보다는 약간 더 상위 단계
- 이진 탐색 트리가 가장 중요***
- 노드로 이루어진 데이터 구조, 부모 - 자식 관계, 나무를 생각해보
- Lists : 선형구조, Trees : 비선형구조
- 노드는 부모 - 자식 관계로만 설정 되어야 한다, 루트에서 멀어지는 방향으로 향해야한다

사용예시
- HTML DOM
- Network Routing
- Abstract Syntax Tree
- Artificial Intelligence
- Folders in Operating Systems
- Computer File Systems

트리 종류
- Trees
- Binary Trees : 자식 노드가 0~2개 여야만 한다
- Binary Search Trees : BST, 데이터를 비교해서 정렬이 가능하다(크고 작은..), 이진 트리의 특별한 종류, 부모 노드의 왼쪽은 부모노므보다 작고 오른쪽은 부모보다 크다

**Binary Search Trees**
- 속도가 빠르다
- 트리를 반으로 나눠 작업하는 것이 되기에...

class Node{
    constructor(value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree{
    constructor(){
        this.root = null
    }
    //insert 메소드
    insert(value){
        var newNode = new Node(value);
        if(this.root === null){
            this.root = newNode;
            return this;
        } else{
            var current = this.root;
            while(true){
                //같은 값이 중복될 경우 무한 루프에 빠지게 된다
                if(value === current.value) return undefiend;

                if(value < current.value){
                    if(current.left === null){
                        current.left = newNode;
                        return this;
                    }else{
                        current = current.left;
                    }
                } else if(value > current.value){
                    if(current.right === null){
                        current.right = newNode;
                        return this;
                    }else{
                        current = current.right;
                    }
                }
            }
        }
    }
    //find 메소드
    find(value){
        if(this.root === null) return false;
        var current = this.root,
            found = false;
        while(current && !found){
            if(value < current.value){
                current = current.left;
            } else if(value > current.value){
                current = current.right;
            } else {
                found = true;
            }
        }
        if(!found) return undefined;
        return current;
    }
    //contains 메소드
    contains(value){
        if(this.root === null) return false;
        var current = this.root,
            found = false;
        while(current && !found){
            if(value < current.value){
                current = current.left;
            } else if(value > current.value){
                current = current.right;
            } else {
                return = true;
            }
        }
        return false;
    }



}

 */
public class Trees {
}
