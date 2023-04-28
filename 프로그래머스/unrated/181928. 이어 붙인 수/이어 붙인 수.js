function solution(num_list) {
    var answer = 0;
    let odd = "";
    let even = "";
    
    num_list.map(a =>{
        a%2 ? odd+=a : even+=a;
    })
    
    answer = Number(odd) + Number(even);
    return answer;
}