const pessoa = {
    nome: 'Alexandre',
    idade: 45,

    // Método
    descrever: function() {
        console.log(`Meu nome é ${this.nome}, tenho ${this.idade} anos.`);
    }
};

pessoa.descrever();

pessoa.nome = 'João';
pessoa.idade = 30;

pessoa.descrever();

pessoa.descrever = function() {
    console.log(`Meu nome é ${this.nome}`);
}

pessoa.descrever();