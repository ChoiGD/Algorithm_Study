function solution(my_strings, parts) {
    var answer = '';
    
    for(let i=0; i<parts.length; i++){
        const [s,e] = parts[i]
        answer+=my_strings[i].substring(s,e+1)
        
    }
    
    
    return answer;
}