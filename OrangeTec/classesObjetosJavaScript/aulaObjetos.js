//OBJETO
const alex = {
    nome: 'Alexandre L Stumpf',
    idade: 43
};

console.log(alex.nome); //mostra só o nome
console.log(alex.idade); //mostra só a idade
console.log(alex); //mostra todo o objeto

alex.altura = 1.85; //inclui altura no objeto

console.log(alex); //mostra todo o objeto com seu novo elemento

delete alex.nome; //deleta o elemento do objeto
 console.log(alex);

 //função dentro de um objeto
 const pessoa = {
    nome: 'Vitor J Guerra',
    idade: 25,
    descrever: function () {
        console.log(`Meu nome é ${this.nome} e minha idade é ${this.idade}`);
    }
 };

//chamando a função dentro do objeto
pessoa.descrever();

pessoa.nome = 'Renan';
pessoa.idade = 30;

//chamando a função dentro do objeto
pessoa.descrever();

//atribuindo nova função ao elemento do objeto
pessoa.descrever = function () {
    console.log(`Meu nome é ${this.nome}`);
}

//chamando o elemento descrever com a nova função
pessoa.descrever();

//acessando valores por uma sintaxe mais dinamica
const atributo = 'idade';
console.log(pessoa[atributo]);
//ou usar a string diretamente
console.log(pessoa['nome']);

//reatribuir com uma sintaxe dinamica
pessoa['nome'] = 'teste';
console.log(pessoa['nome']);
//a outra forma
pessoa.nome = 'teste1';
console.log(pessoa['nome']);