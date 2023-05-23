function solution(arr, k) {
    let answer = [];
    for (let i = 0; i < arr.length; i++) {
        if (answer.length === k) {
            return answer;
        }
        if (answer.includes(arr[i])) {
            continue;
        } else {
            answer.push(arr[i]);
        }
    }
    let test = answer.length;

    for (let i = 0; i < k - test; i++) {

        answer.push(-1);
      
    }
    return answer;
}