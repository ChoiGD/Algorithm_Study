function solution(array) {
    let answer = 1;
    
    let count = new Array(Math.max(...array)+1).fill(0);
    
    for(let i=0; i<array.length; i++){
        count[array[i]]+=1    
    }
    
    if (count.indexOf(Math.max(...count)) !== count.lastIndexOf(Math.max(...count))) {
        return -1
    } else {
        return count.indexOf(Math.max(...count));
    };
    
}