function solution(my_string) {
    let answer = 0;
    let res ='';
    let arr= [];
    res = my_string.replace(/[^0-9]/g,' ');
    let numStr=res.split(' ')
    answer=numStr.map((x)=>(x==='') ? 0 : Number(x)).reduce((pre,cur)=>pre+cur)
    
    return answer;
}