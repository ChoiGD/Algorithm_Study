function isEqual(arr1, arr2) {
    if (arr1.length !== arr2.length) return false;
    for (let i = 0; i < arr1.length; i++) {
        if (arr1[i] !== arr2[i]) return false;
    }
    return true;
}

function solution(arr) {
    let answer = 0;

    while (true) {
        let transformedArr = arr.map(num => {
            if (num >= 50 && num % 2 === 0) {
                return num / 2;
            } else if (num < 50 && num % 2 === 1) {
                return num * 2 + 1;
            } else {
                return num;
            }
        });

        if (isEqual(arr, transformedArr)) {
            break;
        }

        arr = transformedArr;
        answer++;
    }

    return answer;
}