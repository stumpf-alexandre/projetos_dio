//função que calcula e retorna os anos de idade que um ser tera daqui a alguns anos
function calcularIdade(anos){
    return `Daqui a ${anos} anos, ${this.nome} terá ${this.idade + anos} anos de idade.`;
}

//criando os objetos
const pessoa = {
    nome: 'Maria',
    idade: 30,
};

const pessoa1 = {
    nome: 'Carla',
    idade: 26,
};

const animal = {
    nome: 'Fiona',
    idade: 5,
    raca: 'Pug',
};

//mostrando resposta com call
console.log("----------Apresentando dados com call----------");

console.log(calcularIdade.call(pessoa1, 30));

console.log(calcularIdade.call(pessoa, 90));

console.log(calcularIdade.call(animal, 7));

console.log("------------------------------------------------");


//mostrando resposta com apply
console.log("----------Apresentando dados com apply----------");

console.log(calcularIdade.apply(pessoa1, [30]));

console.log(calcularIdade.apply(pessoa, [90]));

console.log(calcularIdade.apply(animal, [7]));

console.log("------------------------------------------------");