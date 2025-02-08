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

function compararPessoas(p1, p2) {
    if (p1.idade > p2.idade) {
        console.log(`${p1.nome} é mais velho(a) que ${p2.nome}.`);        
    } else if (p2.idade > p1.idade) {
        console.log(`${p2.nome} é mais velho(a) que ${p1.nome}.`);        
    } else {
        console.log(`${p1.nome} e ${p2.nome} têm a mesma idade.`);
    }
}

const pessoa1 = new Pessoa('Alexandre', 45);
const pessoa2 = new Pessoa('João', 30);

compararPessoas(pessoa1, pessoa2);