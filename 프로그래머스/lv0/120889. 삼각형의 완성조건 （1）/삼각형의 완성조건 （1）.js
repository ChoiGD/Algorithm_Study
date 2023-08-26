function solution(sides) {
    let answer = 0;
    let s=sides.sort((a,b)=>a-b)
    let max=s[s.length-1]
    let one=s[0]
    let two=s[1]
    max < one + two ? answer = 1 : answer = 2;
    return answer;
}