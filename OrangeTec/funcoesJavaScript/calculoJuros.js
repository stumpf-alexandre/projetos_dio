/*Melhorando código de calculo de juros*/
/*Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento.
Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento:
1 - À vista Débito, recebe 10% de desconto;
2 - À vista no Dinheiro ou PIX, recebe 15% de desconto;
3 - Em duas vezes, preço normal de etiqueta sem juros;
- Acima de duas vezes, preço normal de etiqueta mais juros de 10%;*/

function calculoDesconto(preco, desconto) {
    return preco - (preco * (desconto / 100));
}

function calculoJuros(preco, juros) {
    return preco + (preco * (juros / 100));
}

const preco = 100;
const pagamento = 1;

if (pagamento === 1) {
    console.log(calculoDesconto(preco, 10) + ' R$ a pagar');
} else if (pagamento === 2) {
    console.log(calculoDesconto(preco, 15) + ' R$ a pagar');
} else if (pagamento === 3) {
    console.log(preco + ' R$ a pagar');
} else {
    console.log(calculoJuros(preco, 10) + ' R$ a pagar');
}