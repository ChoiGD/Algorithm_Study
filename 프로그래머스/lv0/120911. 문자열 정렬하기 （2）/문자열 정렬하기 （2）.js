function solution(my_string) {
    let str =[...my_string]
    
    return str.map(x=>x.toLowerCase()).sort().join('');
}