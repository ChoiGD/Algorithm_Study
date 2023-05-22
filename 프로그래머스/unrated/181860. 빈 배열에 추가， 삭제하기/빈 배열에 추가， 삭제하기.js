function solution(arr, flag) {
    var answer = [];
    
    for(let i=0; i<flag.length; i++){
        if(flag[i]){
            for(let j=0; j<arr[i] * 2; j++){
                answer.push(arr[i])
            }
        }else{
            for(let z=0; z<arr[i] ; z++){
                answer.pop()
            }
        }
    }
    
    return answer;
}