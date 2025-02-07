/*
Código condicional de pagamento

1 - À vista Débito, recebe 10% de desconto;
2 - À vista no Dinheiro ou Pix, recebe 15% de desconto;
3 - Em duas vezes, preco normal de etiqueta sem juros;
4 - Acima de duas vezes, preço normal de etiqueta mais juros de 10%
*/

function aplicarDesconto(preco, desconto) {
    return preco - (preco * desconto);
}

function aplicarJuros(preco, juros) {
    return preco + (preco * juros);
}

const valorProduto = 100;
formaDePagamento = 4;

if (formaDePagamento === 1) {
    console.log(aplicarDesconto(valorProduto, 0.1));
} else if (formaDePagamento === 2) {
    console.log(aplicarDesconto(valorProduto, 0.15));
} else if (formaDePagamento === 3) {
    console.log(aplicarDesconto(valorProduto, 0));
} else {
    console.log(aplicarJuros(valorProduto, 0.1));
}