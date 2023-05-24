function solution(rank, attendance) {
    let answer = 0;
    
    let newRank = [];
    
    for(let i=0; i<attendance.length; i++){
        if(attendance[i]){
            newRank.push(rank[i])
        }
    }
    newRank.sort((a,b)=>a-b)
     
    const indexOne=(index)=>{
        return rank.indexOf(newRank[index])
    }
    
    answer = 10000 * indexOne(0) + 100 * indexOne(1) + indexOne(2)
    
    return answer;
}