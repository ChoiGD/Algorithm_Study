function solution(my_string, alp) {
    var answer = '';
    
    let str=[...my_string]
    
    for(let i=0; i<str.length; i++){
        if(str[i]===alp){
            str[i]=alp.toUpperCase()
        }
    }
    answer=str.join('')
    
    return answer;
}