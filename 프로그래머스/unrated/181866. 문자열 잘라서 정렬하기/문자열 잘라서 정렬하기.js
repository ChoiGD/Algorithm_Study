function solution(myString) {
    var answer = [];
    
    let str= myString.split('x')
    
    for(let i=0; i<str.length; i++){
        if(str[i]!==''){
            answer.push(str[i])
        }
    }
    answer.sort()
    return answer;
}