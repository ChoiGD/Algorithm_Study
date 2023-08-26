function solution(my_string) {
    let result = []; 
    let answer = my_string.replace(/[^0-9]/g,'');
    result = [...answer];
    return result.map(Number).reduce((a,b)=>a+b);
}