function solution(box, n) {
    let answer = 0;
    
    answer = box.map(v => Math.floor(v/n)).reduce((a,b)=>a*b)
    
    
    return answer;
}