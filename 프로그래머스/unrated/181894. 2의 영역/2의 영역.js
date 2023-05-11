function solution(arr) {
    var answer = [];
    let idx = [];
    
    for(let i=0; i<arr.length; i++){
        if(arr[i] ===2){
            idx.push(i)
        }
    }
    answer = arr.slice(idx[0],idx[idx.length-1]+1)
    if(answer.length===0){
        answer.push(-1)
    }
    
    return answer;
}