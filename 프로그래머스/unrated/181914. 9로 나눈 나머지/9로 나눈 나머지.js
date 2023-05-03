function solution(number) {
    var answer = 0;
    let num=0;
    let a=number.split('')
    
    for(let i=0; i<a.length; i++){
        num+=Number(a[i])
    }
    answer = num % 9
    
    return answer;
}