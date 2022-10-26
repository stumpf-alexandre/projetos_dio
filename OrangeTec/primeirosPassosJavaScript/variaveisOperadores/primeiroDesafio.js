/*Desafio
Faça um programa para calcular o valor gasto de combustivel em uma viagem
Você tera 3 variaveis:
1- preço do combustivel;
2- gasto médio de combustivel do carro por Km;
3- distância em Km da viagem;

Imprima no console o valor que será gasto de combustivel para realizar esta viagem.*/
const precoCombustivel = 5.79;
const mediaCombustivel = 12;
let distanciaKm = 1580;

let combustivelConsumido = distanciaKm / mediaCombustivel;
let valorGasto = combustivelConsumido * precoCombustivel;

console.log(valorGasto);

console.log(valorGasto.toFixed(2));//para fixar duas casas decimais apos a virgula
