function solution(num, k) {
    var answer = 0;
    console.log(k)
    let numStr=[...num.toString()]
    
    for(let i=0; i<numStr.length; i++){
        if(numStr[i] == k){
            answer = i+1
            break;
        }else{
            answer = -1;
        }
    }
    return answer;
}