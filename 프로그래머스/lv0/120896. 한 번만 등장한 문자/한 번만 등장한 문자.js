function solution(s) {
    let str = [...s];
    const result = {};
    const strArr=[];
    str.forEach((x) => { 
        result[x] = (result[x] || 0)+1; 
    });
    for(var key in result) {
        if(result[key]===1){  
            strArr.push(key)
        }  
    }
    
    return strArr.sort().join('');
}