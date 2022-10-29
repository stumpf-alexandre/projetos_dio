/*2 - Crie uma classe para representar pessoas.
Para cada pessoa teremos os atributos nome, peso e altura.
As pessoas devem ter a capacidade de dizer o valor do seu IMC (IMC = peso / (altura * altura)).
Instancie uma pessoa chamada José que tenha 70Kg de peso e 1,75 de altura e peça ao José para dizer seu IMC.*/
class Pessoa {
    nome;
    peso;
    altura;

    constructor(nome, peso, altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    imc() {
        return (this.peso / (this.altura * this.altura)).toFixed(2);
    }

    classificarIMC() {
        const imc = this.imc();
        if (imc < 18.5) {
            return 'abaixo do peso';
        } else if (imc >= 18.5 && imc < 25) {
            return 'com o peso normal';
        } else if (imc >= 25 && imc < 30) {
            return 'acima do peso';
        } else if (imc >= 30 && imc < 40) {
            return 'obeso';
        } else {
            return 'com obesidade grave';
        }
    }
}

const jose = new Pessoa('José', 70, 1.75);
const renan = new Pessoa('Renan', 63, 1.75)

console.log(`Ola, meu nome é ${jose.nome}, tenho ${jose.altura} de altura e peso ${jose.peso}Kg, e meu IMC é de ${jose.imc()}, estou ${jose.classificarIMC()}.`);
console.log(`Ola, meu nome é ${renan.nome}, tenho ${renan.altura} de altura e peso ${renan.peso}Kg, e meu IMC é de ${renan.imc()}, estou ${jose.classificarIMC()}.`);