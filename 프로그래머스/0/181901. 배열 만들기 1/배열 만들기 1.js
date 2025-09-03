function solution(n, k) {
    var answer = [];
    for(let i=1; i<=n; i++){
        answer.push(i)
    }
    
    return answer.filter(num => num%k === 0);
}