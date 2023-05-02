function solution(arr, queries) {
     
    for(let i=0; i<queries.length; i++){
        const [s, e, k] = queries[i];
        arr = arr.map((v,i)=> s <= i && i <= e && i % k === 0 ? v + 1 : v)
    }
     
    return arr;
}