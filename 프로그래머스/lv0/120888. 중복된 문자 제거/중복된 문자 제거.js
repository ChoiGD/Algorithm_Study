function solution(my_string) {
    var answer = [];
    let a=[...my_string]
    answer = [...new Set(a)]
    return answer.join('');
}