const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    // console.log(Number(input[0]) + Number(input[1]));
    let str = `a = ${Number(input[0])} \nb = ${Number(input[1])}` // \n 붙여야함
    console.log(str);
});