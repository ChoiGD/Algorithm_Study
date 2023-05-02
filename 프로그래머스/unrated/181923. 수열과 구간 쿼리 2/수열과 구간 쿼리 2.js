function solution(arr, queries) {
    const answer = [];
    for (const [s, e, k] of queries) {
        const tmp = arr.filter((v, i)=> s <= i && i <= e && v > k).sort((a,b)=>a-b)[0];
        answer.push(tmp ? tmp : -1)
    }

    return answer;
}