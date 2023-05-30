function solution(array) {
    let answer = 0;
    
    array.sort((a,b)=>a-b)
    let val = parseInt(array.length/2);
    answer=array[val]
    
    return answer;
}