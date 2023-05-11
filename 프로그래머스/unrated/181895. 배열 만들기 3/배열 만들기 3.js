function solution(arr, intervals) {
    var answer = [];
    let str= '';
    for(let i=0; i<intervals.length; i++){
        let [a, b] = intervals[i]
        
        answer.push(...arr.slice(a,b+1))
    }
    console.log(answer)
    
    return answer;
}