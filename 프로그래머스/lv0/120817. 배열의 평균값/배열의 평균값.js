function solution(numbers) {
    let answer = 0;
    
    answer = numbers.reduce((sum, current) => sum + current) / numbers.length;
    
    return answer;
}