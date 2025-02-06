/*Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta
e a escolha da condição de pagamento.
Utilize os códigos da tabela a seguitr para ler qual a condição de pagamento escolhida e efetuar o calculo adequado.

Código Condição de pagamento:
- À vista Débito, recebe 10% de desconto;
- À vista no Dinheiro ou Pix, recebe 15% de desconto;
- Em duas vezes, preço normal de etiqueta sem juros;
-Acima de duas vezes, preço normal de etiqueta mais juros de 10%.
*/

var readline = require('readline-sync');

let preco = parseFloat(readline.question("Qual o valor do produto? "));

let condicoes = parseInt(readline.question("Digite 1 para a forma de pagamento via debito? " + "\n" + "Digite 2 para a forma de pagamento via dinheiro ou pix? " + "\n" + "Digite 3 para a forma de pagamento em 2x? " + "\n" + "Digite 4 para a forma de pagamento maior que 2X ? " + "\n"));

if (preco > 0){
    if (condicoes === 1) {
        console.log(`O valor a ser pago é de R$ ${(preco - (preco * 0.1)).toFixed(2)}`);
    } else if (condicoes === 2) {
        console.log(`O valor a ser pago é de R$ ${(preco - (preco * 0.15)).toFixed(2)}`);
    } else if (condicoes === 3) {
        console.log(`O valor a ser pago é de R$ ${preco.toFixed(2)}`);
    } else if (condicoes === 4) {
        console.log(`O valor a ser pago é de R$ ${(preco + (preco * 0.1)).toFixed(2)}`);
    } else {
        console.log("Forma de pagamento inválida");
    }
} else {
    console.log("Valor do produto inválido");
}