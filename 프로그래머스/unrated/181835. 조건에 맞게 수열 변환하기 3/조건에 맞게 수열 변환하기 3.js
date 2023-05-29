function solution(arr, k) {
    let answer = [];
    
    k%2===0 ? answer=arr.map(n=> n+k) : answer=arr.map(n=> n*k)
    
    return answer;
}