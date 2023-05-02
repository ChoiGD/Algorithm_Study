function solution(arr, queries) {
      for (let i = 0; i < queries.length; i++) {
        const [start, end] = queries[i];
        const temp = arr[start]; 
        arr[start] = arr[end]; 
        arr[end] = temp;
    }
    return arr;
}