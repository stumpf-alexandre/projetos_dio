/*Melhorando o código IMC*/
/*O IMC - Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta.
Formula do IMC:
IMC = peso / (altura * altura)
Elabore um algoritmo que dado o peso e a altura de um adulto mostre sua condição de acordo com a tabela abaixo.
IMC em adultos COndição:
- Abaixo de 18,5 Abaixo do peso;
- Entre 18,5 e 25 Peso normal;
- Entre 25 e 30 Acima do peso;
- Entre 30 e 40 Obeso;
- Acima de 40 Obesidade Grave.*/

function calculoIMC (peso, altura) {
    return peso / Math.pow(altura, 2);
}

function ClassificarIMC (imc) {
    if (imc < 18.5) {
        return 'Abaixo do peso';
    } else if (imc >= 18.5 && imc < 25) {
        return 'Peso normal';
    } else if (imc >= 25 && imc < 30) {
        return 'Acima do peso';
    } else if (imc >= 30 && imc < 40) {
        return 'Obeso';
    } else {
        return 'Obesidade Grave';
    }
}

const peso = 60;
const altura = 1.85;

const imc = calculoIMC(peso, altura);
console.log('IMC = ' + imc.toFixed(2) + ', ' + ClassificarIMC(imc));