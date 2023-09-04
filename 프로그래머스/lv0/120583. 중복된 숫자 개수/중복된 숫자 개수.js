function solution(array, n) {
    let answer = 0;   
    answer=array.reduce((cnt,e)=>cnt+(e===n),0)
    return answer;
}