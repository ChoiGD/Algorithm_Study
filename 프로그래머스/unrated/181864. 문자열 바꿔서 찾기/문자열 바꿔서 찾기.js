function solution(myString, pat) {
    var answer = 0;
    
    let str=''
    for(let i=0; i<myString.length; i++){
        if(myString[i]==="A"){
            str+=myString[i].replace("A","B")
        }else{
            str+=myString[i].replace("B","A")
        }  
    }
    (answer=str.includes(pat)) ? answer=1 : answer=0
    
    return answer;
}