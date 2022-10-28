/*Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento.
Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento:
1 - À vista Débito, recebe 10% de desconto;
2 - À vista no Dinheiro ou PIX, recebe 15% de desconto;
3 - Em duas vezes, preço normal de etiqueta sem juros;
- Acima de duas vezes, preço normal de etiqueta mais juros de 10%;*/

const preco = 100;
const pagamento = 1;

let valor = 0;

if (pagamento === 1) {
    valor = preco - (preco * 0.10);
} else if (pagamento === 2) {
    valor = preco - (preco * 0.15);
} else if (pagamento === 3) {
    valor = preco;
} else {
    valor = preco * 1.10;
}
console.log(valor.toFixed(2) + ' R$ a pagar');