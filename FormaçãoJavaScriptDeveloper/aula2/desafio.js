//Faça um programa para calcular o valor de uma viagem.

//Você terá 5 variáveis. Sendo elas:
//1 - Preço do etanol;
//2 - Preço da gasolina;
//3 - O tipo de combustivel que está no seu carro;
//4 - Gasto médio de combustivel do carro por Km;
//5 - Distancia da viagem em Km;

//Imprimir no console o valor que será gasto para realizar esta viagem.

var readline = require('readline-sync');

let valorCombustivel;

let tipoCombustivel = readline.question('Qual o combustivel que está no seu carro ? ');

if (tipoCombustivel == 'etanol') {
    valorCombustivel = readline.question('Qual o preço do Etanol ? ');
} else {
    valorCombustivel = readline.question('Qual o preço da Gasolina ? ');
}

let media = readline.question('Qual a média de consumo do veículo ? ');

let km = readline.question('Qual a distância da viagem em Km ? ');

let valorViagem = (valorCombustivel / media) * km;

if (tipoCombustivel == 'etanol') {
    console.log(`O valor da viagem será de R$ ${valorViagem.toFixed(2)}, utilizando Etanol.`);
} else {
    console.log(`O valor da viagem será de R$ ${valorViagem.toFixed(2)}, utilizando Gasolina.`);
}