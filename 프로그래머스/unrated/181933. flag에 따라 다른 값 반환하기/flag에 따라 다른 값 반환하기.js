function solution(a, b, flag) {
    var answer = 0;
    
    flag === true ? answer=a+b : answer=a-b;
    
    return answer;
}