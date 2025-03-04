const pessoa = {
  genero: 'Masculino'
}

const alexandre = {
    nome: 'Alexandre',
    idade: 45,
    //__proto__ é utilizado em objetos instanciados
    __proto__: pessoa //comando para que o objeto alexandre herde os atributos do objeto pessoa
}

console.log(alexandre.genero) // Masculino

//Funções construtoras
function Pessoa(nome, idade){
  this.nome = nome
  this.idade = idade
}

const pessoa1 = new Pessoa('Luis', 30)
console.log(pessoa1);

Pessoa.prototype.falar = function () {
    //prototype é utilizado em funções construtoras
    console.log(`Meu nome é ${this.nome}`);
}

pessoa1.falar();


class Pessoa1 {
    constructor(nome, idade){
        this.nome = nome
        this.idade = idade
    }

    falar1() {
        console.log(`Este é o novo método para falar meu nome que é, ${this.nome}`);
    }
}