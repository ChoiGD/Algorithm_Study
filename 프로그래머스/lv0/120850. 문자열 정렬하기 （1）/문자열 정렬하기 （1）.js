function solution(my_string) {
    let result = []; 
    let answer = my_string.replace(/[^0-9]/g,'');
    result = [...answer];
    return result.map(Number).sort((a,b)=> a-b);
}