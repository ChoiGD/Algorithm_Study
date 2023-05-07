function solution(n) {
    var answer = []
    let val = n
    while(val !== 1) {
        answer.push(val)
        if(val%2 === 0) {
            val/=2
        } else {
            val = 3 * val + 1
        }
    }
    answer.push(1)
    return answer
}