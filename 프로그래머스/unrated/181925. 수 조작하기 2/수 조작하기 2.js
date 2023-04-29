function solution(numLog) {
    var answer = '';
    
    const controller = {
        "1":"w",
        "-1":"s",
        "10":"d",
        "-10":"a"
    }
    return numLog.slice(1).reduce((acc, cur, idx)=>acc + controller[`${numLog[idx+1]-numLog[idx]}`],"");
    
    
    return answer;
}