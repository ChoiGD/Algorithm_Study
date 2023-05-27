function solution(n_str) {
    var answer = '';
    
    for(let i=0; i<n_str.length; i++){
        if(n_str[i]!="0"){
            
            for(let j=i; j<n_str.length; j++){
                answer+=(n_str[j]);
            }
            break;
        }
    }
        
    return answer;
}