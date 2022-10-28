let numero = 11;
let numeroPar = numero % 2 === 0;
console.log(numeroPar);
numero = 20;
numeroPar = numero % 2 === 0;
console.log(numeroPar);

let num = 15;
let numDiv = (num % 5) === 0;

if (num === 0) {
    console.log('O número é inválido');
} else if (numDiv) {
    console.log('Sim');
} else {
    console.log('Não');
}

let n = 4;
if ((n % 2) === 0) {
    console.log('O número é par');
} else {
    console.log('O número é impar');
}