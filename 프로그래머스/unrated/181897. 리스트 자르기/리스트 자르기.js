function solution(n, slicer, num_list) {
    var answer = [];
    
    const [a, b, c] = [...slicer]
    
    switch (n){
        case 1: 
          answer = num_list.slice(0, b+1)
          break; 
        case 2:
          answer = num_list.slice(a)
          break;
        case 3:
          answer = num_list.slice(a,b+1) 
          break;
        case 4:
          let str = num_list.slice(a,b+1)
          
          for(let i=0; i<str.length ; i++){
                if(i%c===0){
                    answer.push(str[i])
                }
          }
          
          break; 
  }
    
    return answer;
}