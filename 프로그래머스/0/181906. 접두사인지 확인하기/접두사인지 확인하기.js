function solution(my_string, is_prefix) {
    let answer = [];
    let str = [];
    for(let i=0; i<my_string.length; i++){
        answer.push(my_string.substr(0,i+1))
    }
    str = answer.filter(str=> str===is_prefix) 
    
    if(str.length !=0){
        return 1;
    }else{
        return 0;
    } 
    
}