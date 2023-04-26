function solution(str1, str2) {
    var answer = '';
    
    let strA = str1.split('');
    let strB = str2.split('');
    
    for(let i=0; i<strA.length; i++){
        answer+=strA[i];
        answer+=strB[i];
    }
    
    return answer;
}