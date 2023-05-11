function solution(my_string, indices) {
    var answer = '';
    let str = [...my_string]
    
    for(let i=0; i<indices.length; i++){
        delete str[indices[i]];
    }
    answer=str.join('')
    return answer;
}