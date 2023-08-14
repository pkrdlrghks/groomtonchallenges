const readline = require('readline');
let rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout,
});
let input;
rl.on('line', (line) => {
	input = line;
	rl.close();
});


rl.on('close', () => {
    let s=[];
    s=input.split(" ");
    let w=s[0];
    let r=s[1];
    let rm=parseInt(w*(1+r/30));
	console.log(rm);
})