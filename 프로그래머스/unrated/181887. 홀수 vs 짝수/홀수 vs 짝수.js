function solution(num_list) {
    var answer = 0;
    
    let odd=0;
    let even=0;
    
    for(let i=0; i<num_list.length; i++){
        if(i%2===0){
            even+=num_list[i]
        }else{
            odd+=num_list[i]
        }
    }
    if(odd<even){
        answer=even;
    }else if(odd==even){
        answer=odd;
    }else{
        answer=odd;
    }
    return answer;
}