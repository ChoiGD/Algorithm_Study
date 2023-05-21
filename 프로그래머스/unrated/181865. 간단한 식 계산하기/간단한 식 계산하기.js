function solution(binomial) {
    let answer = 0;

    let [a,op,b] = binomial.split(" ")
    
    const operator = {
        '+': (a,b)=>a+b,
        '-': (a,b)=>a-b,
        '*': (a,b)=>a*b
    }
    
    answer = operator[op](Number(a),Number(b))
    
    return answer;
}