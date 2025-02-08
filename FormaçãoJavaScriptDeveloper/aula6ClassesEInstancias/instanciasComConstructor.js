class Pessoa {
    nome;
    idade;
    anoDeNascimento;
    //Construtor
    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
        this.anoDeNascimento = new Date().getFullYear() - idade;
    }
    // Método
    descrever() {
        console.log(`Meu nome é ${this.nome}, tenho ${this.idade} anos, nascido em ${this.anoDeNascimento}.`);
    }
}

const pessoa1 = new Pessoa('Alexandre', 45);
const pessoa2 = new Pessoa('João', 30);

console.log(pessoa1);
console.log(pessoa2);

pessoa1.descrever();
pessoa2.descrever();