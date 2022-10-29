//CLASSE
//a classe serve para dinamizar o objeto
class Pessoa {
    nome;
    idade;

    //função dentro da classe que descreve essa pessoa
    descrever() {
        console.log(`Meu nome é ${this.nome} e minha idade é ${this.idade}`);
    }
}

//classe é uma definição do que deveria ser uma instancia é uma ocorrencia
//nova instância
const alex = new Pessoa();
alex.nome = 'Alexandre L Stumpf';
alex.idade = 43;

//nova instância
const ana = new Pessoa();
ana.nome = 'Ana da Rosa Stumpf';
ana.idade = 9;

//nova instância
const lara = new Pessoa();
lara.nome = 'Lara da Rosa Stumpf';
lara.idade = 20;

console.log(alex);
console.log(lara);
console.log(ana);
alex.descrever();
lara.descrever();
ana.descrever();

class Person {
    nome;
    idade;
    anoDeNascimento;

    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
        this.anoDeNascimento = 2022 - idade;
    }

    descrever() {
        console.log(`Meu nome é ${this.nome} e minha idade é ${this.idade}`);
    }
}


const vitor = new Person('Vitor', 25);
const renan =new Person('Renen', 30);

vitor.descrever();
renan.descrever();

console.log(vitor);

function compararPessoas(p1, p2) {
    if (p1.idade > p2.idade) {
        console.log(`${p1.nome} é mais velho(a) que ${p2.nome}`);
    } else if (p2.idade > p1.idade) {
        console.log(`${p2.nome} é mais velho(a) que ${p1.nome}`);
    } else {
        console.log(`${p1.nome} e ${p2.nome} tem a mesma idade`);
    }
}

compararPessoas(vitor, renan);