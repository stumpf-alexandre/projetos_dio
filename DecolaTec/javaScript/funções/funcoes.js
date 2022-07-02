//extrutura da funções
function nome(parametros){
    //instruções
    return; //valor de retorno
    //quando invocado o return a função para de ser executada
}

//função anonima
const soma = function(a, b){
    return a + b;
}
console.log(soma(1, 2)); //3
console.log(soma(5, 4)); //9


//função auto invocavel
(
    function(){
        let name = "DIO";
        return name;
    }
)();

//função auto invocavel com parametros
(
    function(a, b){
        return a + b;
    }
)(1, 2);
//3

const soma3 = (
    function(){
        return a + b;
    }
)(1, 2);

console.log(soma3);

//callbacks (uma função passada como argumento para outra)
//maior controle da ordem de chamada
const calc = function(operacao, num1, num2){
    return operacao(num1, num2);
}

const soma1 = function(num1, num2){
    return num1 + num2;
}

const sub = function(num1, num2){
    return num1 - num2;
}

const resultSoma = calc(soma, 1, 2);
const resultSub = calc(sub, 1, 2);

console.log(resultSoma);
console.log(resultSub);

//object argument é uma coleção com todos os parametrosque foram passados quando a função foi envocada
function findMax(){
    let max = -Infinity;
    for(let i = 0; i < arguments.length; i++){
        if (arguments[i] > max){
            max = arguments[i];
        }
    }
    return max;
}
findMax(1, 2, 3, 6, 90, 1);
//90

function showArgs(){
    return arguments;
}
showArgs(1, 2, [2, 3, 4], "string");


//arrays
//spread é uma forma de lidar separadamente com elementos
function sum(x, y, z){
return x + y + z;
}

const numbers = [1, 2, 3];
console.log(sum(...numbers));

//rest combina os argumentos em um array, o que era um elemento independente se torna parte de um array
function confereTamanho(...args){
    console.log(args.length);
}
confereTamanho(); //0
confereTamanho(1, 2); //2
confereTamanho(3, 4, 5); //3

//object destructuring
const user = {
    id: 42,
    displayName: 'jdoe',
    fullName: {
        firstName: 'John',
        lastName: 'Doe'
    }
};

function userId({id}){
    return id;
}

function getFullName({fullName: {firstName: first, lastName: last}}){
    return `${first} ${last}`;
}

userId(user); //42

getFullName(user) //John Doe


//This
//this refere-se ao objeto pai do metodo que ele esta incluido
const pessoa = {
    firstName1: "Andre",
    lastName1: "Soares",
    id: 1,
    //uma função dentro de um objeto é chamada de método
    fullName: function(){
        return this.firstName1 + " " + this.lastName1;
    },
    getId: function(){
        return this.id;
    }
};

pessoa.fullName();
//Andre Soares

pessoa.getId();
//1

//Call
//manipulando os valores do this com call
const pessoa1 = {
    nome: 'Miguel',
};

const animal = {
    nome: 'Murphy',
};

function getSomething(){
    console.log(this.nome);
}

getSomething.call(pessoa);
//vai chamar o nome da pessoa utilizando o this sem ter que indentificalo

getSomething.call(animal);
//vai chamar o nome do animal utilizando o this sem ter que indentificalo

//É possivel passar parâmetros para essa função separando-os por vírgula
const myObj = {
    num1: 2,
    num2: 4,
};

function soma(a, b){
    console.log(this.num1 + this.num2 + a + b);
}

soma.call(myObj, 1, 5);
//12

//Aplly
const pessoa2 = {
    nome: 'Miguel',
};

const animal2 = {
    nome: 'Godi',
};

function getSomathing(){
    console.log(this.nome);
}

getSomething.apply(pessoa2);
//Miguel

getSomething.apply(animal2);
//Godi

//no Aplly é possivel passar parâmetros para essa função dentro de um array
const myObje = {
    num1: 2,
    num2: 4,
};

function soma(a, b){
    console.log(this.num1 + this.num2 + a + b);
}

soma.apply(myObje, [1, 5]);
//12

//Bind
//clona a estrutura da função onde é chamada e aplica o valor do objeto passado como parâmetro
const retornaNomes = function(){
    return this.nome;
};

let bruno = retornaNomes.bind({nome: 'Bruno'});

bruno();
//Buno