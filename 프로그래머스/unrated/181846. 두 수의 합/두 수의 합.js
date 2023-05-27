function solution(a, b) {
    var answer = '';
    
    const add = (str1,str2)=>{
        return ""+(BigInt(str1) + BigInt(str2));
    }
    
    answer = add(a,b)
    
    return answer;
}