//Faça um programa para calcular o valor de uma viagem
//Você tera 3 variaveis. Sendo elas:
//1 - Preço do combustivel
//2 - Gasto médio de combustivel do carro por Km;
//3 - Distancia em Km da viagem;

//Imprima no console o valor que será gasto de combustivel para realizar esta viagem

var readline = require('readline-sync');

let precoCombustivel = readline.question('Qual o preço do combustivel ? ');

let media = readline.question('Qual a média de consumo do veículo ? ');

let km = readline.question('Qual a distância da viagem em Km ? ');

let valorViagem = (precoCombustivel / media) * km;

console.log('O valor da viagem será de R$ ' + valorViagem.toFixed(2));