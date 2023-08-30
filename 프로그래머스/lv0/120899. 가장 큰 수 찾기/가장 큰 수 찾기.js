function solution(array) {
    let answer = [];
    
    let max = Math.max(...array)
 
    answer.push(Math.max(...array),array.indexOf(max))
    return answer;
}