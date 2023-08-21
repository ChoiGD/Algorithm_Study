function solution(emergency) {
    let sorted = emergency.slice().sort((a,b)=>b-a);
    console.log(sorted)
    return emergency.map(v=>sorted.indexOf(v)+1);
}