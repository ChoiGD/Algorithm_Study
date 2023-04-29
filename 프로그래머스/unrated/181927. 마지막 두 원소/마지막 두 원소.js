function solution(num_list) {
    var answer = [];
    answer = num_list;
    let last = num_list[num_list.length-1];
    let lastS = num_list[num_list.length-2];
    
    if(last > lastS){
    
       answer.push(last-lastS);
    }else{
        
       answer.push(2*last);
    }
    
    
    return answer;
}