const readline = require('readline');
let rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout,
});
let input=[]
rl.on('line', (line) => {
	input.push(line.trim());
    if(input.length == Number(input[0]+1)){
	rl.close();
    }
});


rl.on('close', () => {
    let sum=0;
    let formula=[];
    for (let i = 1; i <= input[0]; i++) {
    formula = input[i].split(" ");
    let frontNum=Number(formula[0]);
    let backNum=Number(formula[2]);
    switch (formula[1]) {
        case "+":
            sum += frontNum+backNum
            break;
        case "-":
            sum += frontNum-backNum
            break;
        case "*":
            sum += frontNum*backNum
            break;
        case "/":
            sum += Math.floor(frontNum/backNum)
            break;
    }
        
        
    }
    console.log(sum);
})