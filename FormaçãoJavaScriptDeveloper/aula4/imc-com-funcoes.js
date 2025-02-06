/*O IMC - Indice de Massa Corporal é um critério da Organização Mundial da Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta.

Formula do IMC:

Elabore um algoritmo que dado o peso e a altura de um adulto mostre sua condição de acordo com a tabela a baixo:
IMC em adultos>Condição:
- Adulto de 18.5 Abaixo do peso;
- Entre 18.5 e 25 Peso normal;
- Entre 25 e 30 Acima do peso;
- Entre 30 e 40 Obeso;
- Acima de 40 Obesidade Grave;
*/

var readline = require('readline-sync');

let altura = parseFloat(readline.question('Qual a sua altura? '));

let peso = parseFloat(readline.question('Qual o seu peso? '));

//função para calcular o IMC
function calcularImc(peso, altura) {
    return peso / Math.pow(altura, 2);
}

//função para classificar o IMC
function classificarImc(imc) {
    if (imc < 18.5) {
        return `Abaixo do peso com IMC ${imc.toFixed(2)}`;
    } else if (imc >= 18.5 && imc < 25) {
        return `Peso normal com IMC ${imc.toFixed(2)}`;
    } else if (imc >= 25 && imc < 30) {
        return `Acima do peso com IMC ${imc.toFixed(2)}`;
    } else if (imc >= 30 && imc < 40) {
        return `Obeso com IMC ${imc.toFixed(2)}`;
    } else {
        return `Obesidade Grave com IMC ${imc.toFixed(2)}`;
    }
}

//função principal
function main() {
    const imc = calcularImc(peso, altura);
    console.log(classificarImc(imc));
}

main();

//função não nomeada e só existe dentro do parenteses
(function () {
    const imc = calcularImc(peso, altura);
    console.log(classificarImc(imc));
})();