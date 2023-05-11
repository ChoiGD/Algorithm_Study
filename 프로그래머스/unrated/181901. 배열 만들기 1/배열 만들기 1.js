function solution(n, k) {
    var answer = [];
    let kNum = [];
    
    for(let i=1; i<=n; i++){
        answer.push(i)
    }
    
    
    return answer.filter(num => num%k === 0);
}