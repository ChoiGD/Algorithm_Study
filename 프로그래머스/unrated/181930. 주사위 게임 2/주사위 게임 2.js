function solution(a, b, c) {
    var answer = 0;
    
    let hapA = (a+b+c);
    let hapB = hapA * ((a*a) + (b*b) + (c*c));
    let hapC = hapB * ((a*a*a) + (b*b*b) + (c*c*c)) 
    
    if(a == b && b == c && a == c){
        answer=hapC;
    }else if( (a != b && b == c) || (a == b && b != c) || (a ==c && c != b)){
        answer=hapB;
    }else{
        answer=hapA;
    }
    console.log((a != b && b == c) || (a == b && b != c))
    return answer;
}