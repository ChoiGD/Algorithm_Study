function solution(array, height) {
    let answer = 0;
    
    answer=array.reduce((cnt,e)=>cnt+ (e>height),0)
    
    return answer;
}