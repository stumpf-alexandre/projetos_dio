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

let imc = parseFloat(peso / Math.pow(altura, 2));

if (imc < 18.5) {
    console.log(`Abaixo do peso com IMC ${imc.toFixed(2)}`);
} else if (imc >= 18.5 && imc < 25) {
    console.log(`Peso normal com IMC ${imc.toFixed(2)}`);
} else if (imc >= 25 && imc < 30) {
    console.log(`Acima do peso com IMC ${imc.toFixed(2)}`);
} else if (imc >= 30 && imc < 40) {
    console.log(`Obeso com IMC ${imc.toFixed(2)}`);
} else {
    console.log(`Obesidade Grave com IMC ${imc.toFixed(2)}`);
}