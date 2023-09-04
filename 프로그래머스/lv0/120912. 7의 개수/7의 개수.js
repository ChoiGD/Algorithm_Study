function solution(array) {
    let answer = 0;
   
    let tmp = [];
    for(let i=0; i<array.length; i++){
        let res = '';
        res += array[i]      
        tmp.push(...res)
    }
    answer= tmp.map(x=>Number(x)).reduce((cnt,e)=> cnt + (7===e),0)
    
    return answer;
}