function solution(dots) {
    let answer = 0;
    dots.sort((a,b)=>a[0] - b[0]);
    answer = Math.abs(dots[0][1] - dots[1][1]) * Math.abs(dots[1][0] - dots[2][0]);
    return answer;
}