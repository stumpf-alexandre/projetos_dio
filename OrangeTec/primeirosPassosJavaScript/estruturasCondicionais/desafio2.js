/*Faça um programa para calcular o valor de uma viagem
Você tera 5 variaveis. São elas
1 - Preço do etanol;
2 - Preço da gasolina;
3 - O tipo de combustivel que está no carro;
4 - Gasto médio de combustivel do carro por km;
5 - Distância em km da viagem;
*/
const precoEtanol = 6.89;
const precoGasolina = 4.55;
const tipoCombustivel = 'etanol';
const media = 17;
const distancia = 250;

const litrosCombustivel = distancia / media;
let valor = 0;

if (tipoCombustivel === 'etanol') {
    valor = litrosCombustivel * precoEtanol;
    console.log(valor.toFixed(2) + ' R$');
} else {
    valor = litrosCombustivel * precoGasolina;
    console.log(valor.toFixed(2) + ' R$');
}