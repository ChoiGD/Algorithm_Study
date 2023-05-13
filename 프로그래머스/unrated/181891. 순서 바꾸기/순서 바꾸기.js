function solution(num_list, n) {
    var answer = [];
    
    let strF = num_list.slice(n)
    let strS = num_list.slice(0,n)
    
    answer=strF.concat(strS)
    
    return answer;
}