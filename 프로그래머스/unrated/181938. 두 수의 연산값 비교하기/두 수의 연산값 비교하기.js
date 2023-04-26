function solution(a, b) {
    var answer = ""+a+ b;
    var num = 2*a*b;
    if(answer > num) return Number(answer);
    else return num;
}