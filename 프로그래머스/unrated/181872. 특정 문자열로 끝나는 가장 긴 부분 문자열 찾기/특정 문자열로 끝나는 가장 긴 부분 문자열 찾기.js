function solution(myString, pat) {
    let answer =  myString.slice(0,myString.lastIndexOf(pat))+pat
    return answer;
}