function solution(arr, delete_list) {
    var answer = [];
    
    for(let i=0; i<arr.length; i++){
       for(let j=0; j<delete_list.length; j++){
           let idx=arr.indexOf(delete_list[j])
           delete arr[idx]
       }
       answer=arr.filter(a=>a!=null)
    }

    return answer;
}