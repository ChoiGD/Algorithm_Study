function solution(my_string, overwrite_string, s) {
    let answer = '';
    
    let list= [...overwrite_string];
    
   
    let firstStr = my_string.substring(0,s);
    
    let middleStr = overwrite_string;
    
    let endStr = my_string.substring(s + list.length);
    answer = firstStr + middleStr+ endStr;
   
    
    return answer;
}