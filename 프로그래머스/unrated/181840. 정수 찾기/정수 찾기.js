function solution(num_list, n) {
    let answer = 0;
    
    num_list.map(num => num===n ? answer=1 : answer)
    
    return answer;
}