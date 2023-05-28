function solution(date1, date2) {
    let answer = 0;
    
    const [y1,m1,d1] = [...date1] 
    const [y2,m2,d2] = [...date2] 
    
    const dateStr1 = y1 +"-"+ m1 +"-"+ d1
    const dateStr2 = y2 +"-"+ m2 +"-"+ d2
    
    const year1 = new Date(dateStr1)
    const year2 = new Date(dateStr2)
    
    year1 >= year2 ? answer : answer=1
    
    return answer;
}