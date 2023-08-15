const readline = require('readline');
let rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout,
});
let input=[]
rl.on('line', (line) => {
	input.push(line.split("\n"));
	rl.close();
});

rl.on('close', () => {
    let n=input[0];
    let time=[];
    let t=input[1].split(" ")[0];
    let m=input[1].split(" ")[1];
    for (let i = 2; i < input.length; i++) {
        m+=input[i];
    }
    t=parseInt((t+parseInt(m/60))/24);
    m%=60;
	console.log(t+" "+m);
})