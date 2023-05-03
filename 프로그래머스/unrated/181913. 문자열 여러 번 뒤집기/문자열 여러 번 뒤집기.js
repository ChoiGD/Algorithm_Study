function solution(my_string, queries) {
    var answer = '';
    
    let str =my_string.split('')
    
    for(let i=0; i<queries.length; i++){
        const [s, e] = queries[i];
        let tmp = str.slice(s, e + 1);
        str.splice(s, tmp.length, ...tmp.reverse());
    }
   
    return answer=str.join("");
}