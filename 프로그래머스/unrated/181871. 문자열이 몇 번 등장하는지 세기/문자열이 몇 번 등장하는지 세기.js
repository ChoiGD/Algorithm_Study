function solution(myString, pat) {
    var answer = 0;
    let str ='';
    for(let i=0; i<myString.length; i++){
        str+=myString[i]
        if(str.endsWith(pat)){
            answer++;
        }
    }
    return answer;
}