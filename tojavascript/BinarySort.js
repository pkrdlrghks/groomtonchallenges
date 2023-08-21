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
    a.sort(function(a,b){
        let aCounter=0;
        let share=a;
        while(share !=0){
            aCounter+=share%2;
            share/=2;
        }
        let bCounter=0;
        share=b
        while(share !=0){
            bCounter+=share%2;
            share/=2;
        }
        let change=(bCounter-aCounter !=0 )? bCounter-aCounter : b-a;
        return change; 
    })
    console.log(a[k-1]);
})