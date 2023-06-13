function solution(n, k) {
    var answer = 0;
    
    let ser = 0;
    for(let i=1; i<n+1 ; i++){
        if(i%10===0){
            ser+=1;
            continue;
        }
    }
    answer = 12000 * n + k *2000 - ser *2000
    
    return answer;
}