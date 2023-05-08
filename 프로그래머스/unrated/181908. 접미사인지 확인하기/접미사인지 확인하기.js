function solution(my_string, is_suffix) {
    var answer = 0;
    my_string.endsWith(is_suffix) ? answer= 1: answer=0;
    return answer;
}