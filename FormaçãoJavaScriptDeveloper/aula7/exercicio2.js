/*
2 - Crie uma classe para representar pessoas.
Para cada pessoa teremos os atributos nome, peso e altura.
As pessoas devem ter a capacidade de dizer o valor do seu IMC (IMC = peso / (altura * altura)).
Instancie uma pessoa chamada José que tenha 70Kg de peso e 1.75 de altura e peça ao José para dizer o valor do seu IMC.
*/

class Pessoa {
    nome;
    peso;
    altura;

    //Construtores
    constructor(nome, peso, altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    //Método
    valorIMC() {
        return this.peso / (this.altura * this.altura);
    }

    classificarIMC() {
        const imc = this.valorIMC();
        if (imc < 18.5) {
            return `Abaixo do peso`;
        } else if (imc >= 18.5 && imc < 25) {
            return `Peso normal`;
        } else if (imc >= 25 && imc < 30) {
            return `Acima do peso`;
        } else if (imc >= 30 && imc < 40) {
            return `Obeso`;
        } else {
            return `Obesidade Grave`;
        }
    }
}

const pessoa1 = new Pessoa('José', 70, 1.75);
console.log(`O IMC de ${pessoa1.nome} é ${pessoa1.valorIMC().toFixed(2)}. ${pessoa1.classificarIMC()}`);

const pessoa2 = new Pessoa('Alexandre', 130, 1.85);
console.log(`O IMC de ${pessoa2.nome} é ${pessoa2.valorIMC().toFixed(2)}. ${pessoa2.classificarIMC()}`);