function solution(n) {
    var answer = 0;
   
    let odd = 0;
    let even = 0;

    for (i = 1; i <= n; i++) {
        if (i % 2 === 0) {
            even += (i*i);
            answer = even;
        } else {
            odd += i;
            answer = odd;
        }
    }
    return answer;
}