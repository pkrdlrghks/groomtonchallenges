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
    let n=input[0].split(" ")[0];
    let k=input[0].split(" ")[1];
    let a=[]
    a=input[1].split(" ");
    
    
    console.log();
})