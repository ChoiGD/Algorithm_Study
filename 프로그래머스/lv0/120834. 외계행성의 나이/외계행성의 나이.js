function solution(age) {
    let str = [...age+""]
    let pro = ["a","b","c","d","e","f","g","h","i","j"];
    
    const a = str.map((i)=>pro[i])
    
    return a.join('');
}