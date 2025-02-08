//Classe é uma definição do que deveria ser
class Pessoa {
    nome;
    idade;

    // Método
    descrever() {
        console.log(`Meu nome é ${this.nome}, tenho ${this.idade} anos.`);
    }
}

//Instancia é uma ocorrencia de uma classe
const pessoa1 = new Pessoa();
pessoa1.nome = 'Alexandre';
pessoa1.idade = 45;

const pessoa2 = new Pessoa();
pessoa2.nome = 'João';
pessoa2.idade = 30;

console.log(pessoa1);
console.log(pessoa2);

pessoa1.descrever();
pessoa2.descrever();