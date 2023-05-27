function solution(my_string, target) {
    let answer = 0;
      
    my_string.includes(target) ? answer=1 : answer =0;
    
    return answer;
}