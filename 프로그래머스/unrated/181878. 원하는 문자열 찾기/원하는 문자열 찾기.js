function solution(myString, pat) {
    var answer = 0;
    
    let up=myString.toUpperCase().includes(pat.toUpperCase())
    let low=myString.toLowerCase().includes(pat.toLowerCase())
    
    if(up && low){
        answer = 1 
    }else{
        answer = 0
    }
    
    return answer;
}