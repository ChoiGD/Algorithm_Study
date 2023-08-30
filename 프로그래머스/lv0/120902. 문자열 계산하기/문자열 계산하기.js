function solution(my_string) { 
    const strArr = my_string.split(" ");
    
    let result = Number(strArr[0]);
    
    strArr.forEach((item, index) => {
        if(item === "+"){
            result += Number(strArr[index + 1]);
        }
        
        if(item === "-"){
            result -= Number(strArr[index + 1]);
        }
    })
    
    return result;
}