function solution(names) {
    var answer = [];
    let str = [];
    let size = 5;
    
    for(let i=0; i<names.length ; i+=size){
        answer.push(names.slice(i,i+size))
    }
    
     for(let i=0; i<answer.length; i++){
        str.push(answer[i][0])
    }
    
    
    return str;
}