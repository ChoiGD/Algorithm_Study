function solution(my_string, s, e) {
    var answer = '';
    
    let fStr = my_string.slice(0,s)
    let sStr =(my_string.split('').slice(s,e+1).reverse().join(''))
    let tStr = my_string.slice(fStr.length+sStr.length)
  
    answer = fStr+sStr+tStr
    return answer;
}