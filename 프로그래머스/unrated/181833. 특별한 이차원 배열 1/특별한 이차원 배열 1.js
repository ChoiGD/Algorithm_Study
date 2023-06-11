function solution(n) {
    let answer = Array.from(Array(n), ()=> new Array(n))
    
    for(let i=0; i<n; i++){
        for(let j=0; j<n; j++){
           if (i == j) {
                answer[i][j] = 1
            } else {
                answer[i][j] = 0
            } 
        }
    }
    
    return answer;
}