function solution(my_str, n) {
    let answer = [];
    
    let res = [...my_str];
    
    let end=res.length
    
    for(let i=0; i<end; i+=n){
        answer.push(my_str.slice(i, i+n))
    }
    
    return answer;
}