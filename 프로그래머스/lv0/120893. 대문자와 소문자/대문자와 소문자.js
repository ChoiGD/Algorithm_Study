function solution(my_string) {
    let answer = '';
    let strArr=[...my_string]
    answer=strArr.map((x)=>{
        return (x === x.toUpperCase()) ? x.toLowerCase() : x.toUpperCase()
    }).join('')
    return answer;
}