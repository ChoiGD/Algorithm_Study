function solution(ineq, eq, n, m) {
    var answer = 0;
    
    console.log(ineq+eq)
     
    switch (ineq+eq) {
        case '<=': n <= m ? answer=1 : answer=0;
        break;
        case '>!': n > m ? answer=1 : answer=0;
        break;
        case '>=': n >= m ? answer=1 : answer=0;
        break;
        case '<!': n < m ? answer=1 : answer=0;
        break;
    }
    return answer;
}