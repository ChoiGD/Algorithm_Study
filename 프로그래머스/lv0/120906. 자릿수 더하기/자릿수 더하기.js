function solution(n) {
    let answer = 0;
    let numStr = n.toString()
    let numArr = [...numStr]
    
    answer=numArr.reduce((pre,cur)=>Number(pre)+Number(cur),0)
    
    return answer;
}