const factorial=(num)=> {
    let returnFactorial = BigInt(1)
    for(let i = 1; i <= num ; i++ ) {
        returnFactorial*=BigInt(i)
    }
    return returnFactorial
}

function solution(balls, share) {
    return factorial(balls) / (factorial((balls-share)) * factorial(share))
}

