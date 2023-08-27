function solution(n) {
    var answer = [];
    let num = 2;
    while(n >=2){
        if(n % num === 0){
            answer.push(num)
            n = n /num
        }else{
            num++;
        }
    }
    return [...new Set(answer)];
}