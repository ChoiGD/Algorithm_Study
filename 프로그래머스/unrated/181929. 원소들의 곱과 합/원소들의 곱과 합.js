function solution(num_list) {
    var answer = 0;
    let hap = 0;
    let gop = 1;
    
    num_list.map(a =>{
        gop *= a;
        hap += a;
    })
    
    gop < (hap*hap) ? answer=1 : answer=0;
    return answer;
}