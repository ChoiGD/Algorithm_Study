function solution(quiz) {
    let answer = [];

    for(let i=0; i<quiz.length; i++){
        let quizStr = quiz[i].split(' ')
        let num1 = Number(quizStr[0])
        let num2 = Number(quizStr[2])
        let numRes = Number(quizStr[4])
        let op = quizStr[1]
        let tmp = 0;
        
        if(op == '+'){
            tmp = num1 + num2     
        }else if(op == '-'){
            tmp = num1 - num2
        }else{
            break;
        }
        (tmp === numRes) ? answer.push("O") : answer.push("X")
        
    }
    
    return answer;
}