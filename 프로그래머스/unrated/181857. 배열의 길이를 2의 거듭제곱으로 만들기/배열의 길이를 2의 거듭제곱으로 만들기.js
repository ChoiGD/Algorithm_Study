function solution(arr) {
    
    const len = arr.length;
    
    let i = 0;

    while (true) {
        const num = 2 ** i;

        if (len > num) {
            i++;
        } else {
            for (let i = 0; i < num - len; i++) {
                arr.push(0);
            }

            return arr;
        }
    }
}