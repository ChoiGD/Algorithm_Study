function solution(arr, n) {
    var answer = [];
    
    if(arr.length%2===0){
        answer = arr.map((a,i) =>{
            return i%2!==0 ? a+n : a
        }) 
    }else{
        answer = arr.map((a,i) =>{
            return i%2===0 ? a+n : a
        })
    }
    
    return answer;
}