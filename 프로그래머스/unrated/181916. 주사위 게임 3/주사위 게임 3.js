function solution(a, b, c, d) {

    const [p, q, r, s] = [a, b, c, d].sort((a, b) => a - b);
    
    if (p === q && q === r && r  === s) return 1111 * a;
    
    if (p === q && q === r) return Math.pow(10 * p + s, 2);
    if (q === r && r === s) return Math.pow(10 * q + p, 2);
    
    if (p === q && r === s) return (p + r) * Math.abs(p - r);

   
    if (p === q) return r * s;
    if (q === r) return p * s;
    if (r === s) return p * q;

    return Math.min(p, q, r, s);
}