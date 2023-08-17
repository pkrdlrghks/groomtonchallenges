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
    let n=input[0];
    let k=[n]
    k=input[1].split(" ").map(Number);
    let i=1;
    let sum=k[0];
    while(i<k.length){
        if(k[i-1]>k[i]){
            break;
        }
        sum+=k[i];
        i++
    }
    while(i<k.length){
        if(k[i-1]<k[i]){
            sum=0;
            break;
        }
        sum+=k[i];
        i++
    }
    
    console.log(sum);
})