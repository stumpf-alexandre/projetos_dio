/*
Faça um programa que calcule e imprima o salário a ser transferido para o funcionário.
Para realizar o calculo receba o valor bruto do salário e o adicional.
O salário a ser transferido é calculado da seguinte maneira:
    valor bruto do salário - percentual de imposto mediante a faixa salarial + adicional dos beneficios.
Para calcular o percentual de impostos segue as aliquotas:
De R$ 0.00 a R$ 1100.00 = 5.00%
De R$ 11.01 a R$ 2500.00 = 10.00%
Maior que R$ 2500.00 = 15.00%
*/
const {gets, print} = require('./funcoesAuxiliaresEx4');

const salarioBruto = gets();
const beneficios = gets();

function calcularPorcentagem (valor, percentual) {
    return valor * (percentual / 100);
}

function percentualComBaseNoSalario(salario) {
    if (salario >= 0 && salario <= 1100) {
        return 5;
    } else if (salario >= 1100.01 && salario <= 2500) {
        return 10;
    } else {
        return 15;
    }
}

const aliquotaImposto = percentualComBaseNoSalario(salarioBruto);

const valorImposto = calcularPorcentagem(salarioBruto, aliquotaImposto);

const valorATransferir = salarioBruto - valorImposto + beneficios;

print(valorATransferir);