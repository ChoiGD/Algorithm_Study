function solution(numLog) {
    let answer ="";
    for(let i = 0 ; i < numLog.length-1 ; i++ ){
        const val = numLog[i+1] - numLog[i];
        switch(val){
            case 1: 
                answer+="w";
                break;
            case -10: 
                answer+="a";
                break;
            case -1: 
                answer+="s";
                break;
            case +10: 
                answer+="d";
                break;
        }

    }
    return answer;
}
