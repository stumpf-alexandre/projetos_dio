/*
Faça um programa que receba N (quantidade de números) e seus respectivos valores.
Imprima o maior número par e o menor número impara.
*/
const {gets, print} = require('./funcoesAuxiliaresEx3');

const valor = gets();
let maiorValorPar = null;
let menorValorImpar = null;

for (let i = 0; i < valor; i++) {
    const num = gets();
    if (num % 2 === 0) {
        if (maiorValorPar === null || num > maiorValorPar) {
            maiorValorPar = num;
        }
    } else {
        if (menorValorImpar === null || num < menorValorImpar) {
            menorValorImpar = num;
        }
    } 
}

print(maiorValorPar);
print(menorValorImpar);