function solution(order) {
   
    let orderPrice = order
    .map((x)=>(x.includes('americano') || x.includes('anything')) ? 4500:5000)
    .reduce((pre,cur)=>pre+cur)
    
    return orderPrice;
}