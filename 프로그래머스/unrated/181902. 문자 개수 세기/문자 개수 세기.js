function solution(my_string) {
    
    let str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    let strArr =[...str];
    let numArr = strArr.map(str => 0)
    
    for(let i=0; i<my_string.length; i++){
        let idx = strArr.indexOf(my_string[i])
        numArr[idx]+=1
    }
    
    return numArr;
}