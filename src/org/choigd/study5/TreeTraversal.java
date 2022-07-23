package org.choigd.study5;
/*
중요

TreeTraversal(트리 순회)
어떤 트리에서든지 사용할 수 있는 개념
재귀함수를 많이 사용하여 해결한다

- Breadth First Search(너비 우선 탐색)
수평으로 작업을 한다
1. 큐를 사용하여 선입선출
2. 요소를 맨 앞에서 제거하고 맨 뒤에다가 넣어야


- 깊이 우선 탐색(Depth First Search)
형제 노드로 넘어가기전에 수직으로 내려가는 탐색
    - 전위 순회
    - 후위 순회
    - 중위 순회

- BFS? DFS?
100개의 노드가 있다면 너비 우선 탐색, 깊이 우선 탐색 둘다 한번씩 노드를 봐야한 = 같은 시간 복잡도
트리가 넓다면 너비 우선은 큐를 저장하는데 더 많은 공간을 사용
깊고 긴 트리라면 깊이 우선이 더 많은 공간을 사용

- 트리 복습
트리 비선형 데이터 구조 => 노드들로 구성, 하나틔 루트와 많은 자식 노드들로 구성
이진트리 => 아무런 종류의 값을 가질 수 잇지만 각 노드는 최대 두개의 자식을 가질 수 있는 특별한 트리
이진 탐색 트리 => 이진 트리의 특별 버전, 정렬된 트리(부모의 왼쪽에 있는 모든 노드는 부모보다 작고 오른쪽에 있는 모든 노드는 크다)
class Node {
    constructor(value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    constructor(){
        this.root = null;
    }
    insert(value){
        var newNode = new Node(value);
        if(this.root === null){
            this.root = newNode;
            return this;
        }
        var current = this.root;
        while(true){
            if(value === current.value) return undefined;
            if(value < current.value){
                if(current.left === null){
                    current.left = newNode;
                    return this;
                }
                current = current.left;
            } else {
                if(current.right === null){
                    current.right = newNode;
                    return this;
                }
                current = current.right;
            }
        }
    }
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
                return true;
            }
        }
        return false;
    }
    //Breadth First Search(너비 우선 탐색)
    BFS(){
        var node = this.root,
            data = [],
            queue = [];
        queue.push(node);

        while(queue.length){
           node = queue.shift();
           data.push(node.value);
           if(node.left) queue.push(node.left);
           if(node.right) queue.push(node.right);
        }
        return data;
    }
    //전위
    DFSPreOrder(){
        var data = [];
        function traverse(node){
            data.push(node.value);
            if(node.left) traverse(node.left);
            if(node.right) traverse(node.right);
        }
        traverse(this.root);
        return data;
    }
    //후위
    DFSPostOrder(){
        var data = [];
        function traverse(node){
            if(node.left) traverse(node.left);
            if(node.right) traverse(node.right);
            data.push(node.value);
        }
        traverse(this.root);
        return data;
    }
    //중위
    DFSInOrder(){
        var data = [];
        function traverse(node){
            if(node.left) traverse(node.left);
            data.push(node.value);
            if(node.right) traverse(node.right);
        }
        traverse(this.root);
        return data;
    }
}
 */
public class TreeTraversal {
}
