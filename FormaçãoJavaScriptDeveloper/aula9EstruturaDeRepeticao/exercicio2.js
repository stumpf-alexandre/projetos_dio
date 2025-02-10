//Crie um programa que dado um número imprima a sua tabuada.
var readline = require('readline-sync');

const num = parseInt(readline.question('Digite um número: '));
let tabuada = [];
console.log(`Tabuada do ${num}`);
for (let i = 0; i <= 10; i++) {
    tabuada[i] = num * i;
    console.log(`${num} x ${i} = ${tabuada[i]}`);
}