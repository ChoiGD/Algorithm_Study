function solution(myString) {
    var answer = '';
    
    let str =[...myString]
    
    
    for(let i=0; i<str.length; i++){
        if(str[i]==="a"){
            str[i]=str[i].toUpperCase()
        }else if(str[i]!=="A"){
            str[i]=str[i].toLowerCase()
        }
    }
    answer=str.join('')
    
    return answer;
}