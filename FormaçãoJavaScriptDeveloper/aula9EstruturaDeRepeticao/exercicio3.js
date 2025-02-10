//Crie um programa que seja capaz de percorrer uma lista de números e imprima cada número par encontrado.
var readline = require('readline-sync');

const qtd = parseInt(readline.question('Digite a quantidade de números a lista deve possuir: '));
let num = [];

for (let i = 0; i <= qtd; i++) {
    num[i] = i;
    if (num[i] % 2 === 0) {
        console.log(num[i]);
    }
}