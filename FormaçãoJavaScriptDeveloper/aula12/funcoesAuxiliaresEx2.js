var readline = require('readline-sync');

let media = readline.question('Qual a média do aluno ? ');
let i = 0;

function gets() {
    const valor = media[i];
    i++;
    return valor;
}

function print(texto) {
    console.log(texto);
}

module.exports = { gets, print };