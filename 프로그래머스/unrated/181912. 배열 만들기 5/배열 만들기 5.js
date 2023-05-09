function solution(intStrs, k, s, l) {
    
    return intStrs.map(a => Number(a.substr(s,l))).filter(a=> a > k);
}