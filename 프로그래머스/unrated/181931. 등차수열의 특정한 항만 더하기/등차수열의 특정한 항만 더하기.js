function solution(a, d, included) {
    var answer = 0;
    let num =[a];
    for(let i=1; i<=included.length; i++){
        num[i]=num[i-1]+d;
        if(included[i-1]){
            answer+=num[i-1];
        }
    }

    return answer;
}