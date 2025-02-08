const pessoa = {
    nome: 'Alexandre',
    idade: 45,

    descrever: function() {
         console.log(`Meu nome é ${this.nome}, tenho ${this.idade} anos`);
    }
};

const atributo = 'idade';

console.log(pessoa[atributo]);

pessoa[atributo] = 46;

console.log(pessoa[atributo]);