function solution(numbers) {
    let answer = 0;
    const sortNum = numbers.sort((a,b)=> a-b);
    answer= sortNum[sortNum.length-2] * sortNum[sortNum.length-1];
    return answer;
}