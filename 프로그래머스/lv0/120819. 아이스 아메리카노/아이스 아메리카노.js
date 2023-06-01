function solution(money) {
    var answer = [];
    
    let count = money%5500
    let moneyOne=Math.floor(money/5500)
    
    answer.push(moneyOne)
    answer.push(count)
    
    return answer;
}