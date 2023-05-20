function solution(my_string) {
    let answer = my_string.split(" ")
    let result = [];
    for(let i=0; i<answer.length; i++){
        if(answer[i]!==""){
            result.push(answer[i])
        }
    }
    return result;
}