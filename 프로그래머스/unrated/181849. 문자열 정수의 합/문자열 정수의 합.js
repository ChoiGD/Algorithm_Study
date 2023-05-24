function solution(num_str) {
    var answer = 0;
    
    let str= [...num_str]
    
    let num = str.map(a=>Number(a))
    
    answer=num.reduce((a,b)=>a+b)
    
    return answer;
}