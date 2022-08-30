package org.choigd.study3;
/*
DataStructures(자료구조)
고급 자료 구조 사용을 필요로 하는 경우가 많아진다. 선형적이지 않은 복잡한 데이터에 관하여
API, 라이브러리를 사용할 경우도 있다. 각각의 특정상황에 유용한 경우가 다르다
-이진 검색 트리
-큐
-단방향 연결 리스트
-비방향/비비중 그래프 등

ES2015
Class => 사전에 정의된 속성 및 메소드들을 이용해 객체를 생성하기 위한 청사진
class Student {
    constructor(firstName, lastName, year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = year;
        this.tardies = 0;
        this.scores = [];
    }
    fullName(){
        return `Your full name is ${this.firstName} ${this.lastName}`;
    }
    markLate(){
        this.tardies += 1;
        if(this.tardies >= 3) {
            return "YOU ARE EXPELLED!!!!"
        }
        return `${this.firstName} ${this.lastName} has been late ${this.tardies} times`;
    }
    addScore(score){
        this.scores.push(score);
        return this.scores
    }
    calculateAverage(){
        let sum = this.scores.reduce(function(a,b){return a+b;})
        return sum/this.scores.length;
    }
}

let firstStudent = new Student("Colt", "Steele",1);
let secondStudent = new Student("Blue", "Steele",2);

*/
public class DataStructures {



}
