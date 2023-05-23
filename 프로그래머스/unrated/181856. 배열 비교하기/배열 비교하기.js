function solution(arr1, arr2) {
    var answer = 0;
    
    if(arr1.length > arr2.length){
        answer = 1;   
    }else if(arr1.length === arr2.length){
        let arr1Num=arr1.reduce((a,b)=>a+b)
        let arr2Num=arr2.reduce((a,b)=>a+b)
        if(arr1Num > arr2Num){
            answer = 1;
        }else if(arr1Num === arr2Num){
            answer = 0;
        }else{
            answer = -1;
        }
        
    }else{
        answer = -1;
    }
    
    return answer;
}