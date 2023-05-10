function solution(q, r, code) {
    var answer = [...code];
    let str =''
    
    for(let i =0; i< answer.length; i++){
        if(i%q===r){
            str+=answer[i]
        }
    }
    
    return str;
}