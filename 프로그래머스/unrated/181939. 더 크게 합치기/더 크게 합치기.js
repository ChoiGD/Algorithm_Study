function solution(a, b) {
    var answer = 0;
    let numA = 0;
    let numB = 0;
    numA=Number(""+ a + b);
    numB=Number(""+ b + a);
    
    numA<numB ? answer=numB : answer=numA;
    
    return answer;
}