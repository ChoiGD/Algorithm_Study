function solution(cipher, code) {
    let answer = '';
    let strArr = [...cipher]
    
    for(let i=code; i<=strArr.length; i+=code){
        answer+=strArr[i-1]
    }
    
    return answer;
}