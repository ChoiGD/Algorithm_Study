function solution(array, n) {
    let sortArr = array.sort()
    let arr = sortArr.map(x=>Math.abs(x-n))
    return sortArr[arr.indexOf(Math.min(...arr))];
}