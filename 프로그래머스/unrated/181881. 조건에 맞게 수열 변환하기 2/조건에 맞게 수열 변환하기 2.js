
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
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