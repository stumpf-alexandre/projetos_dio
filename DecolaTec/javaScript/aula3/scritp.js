// o que são vetores e arrays

//como declarar um array
let array = ['string', 1, true];
console.log(array);

//pode guardar varios tipos de dados
let array1 = ['string', 1, true, ['array2'], ['array3'], ['array4'], ['array5']];
console.log(array1);
console.log(array1[2]);
console.log(array1[5]);
console.log(array1[1]);

//manipulando o array
//forEach intera um array
array1.forEach(function(item, index){console.log(item, index)});

//push add item no final do array
array1.push('novo item');
console.log(array1);
array1.push(1);
console.log(array1);

//pop remove item no final do array
array1.pop();
console.log(array1);
array1.pop();
console.log(array1);

//shift remove item no inicio do array
array1.shift();
console.log(array1);

//unshift add item no inicio do array
array1.unshift('novo item no inicio');
console.log(array1);

//indexOf retorna o indice de um valor
console.log(array1.indexOf(true));

//splice remove ou substitui um item pelo índice
array1.splice(0, 3);
console.log(array1);

//slice retorna uma parte de um array existente
let novoArray = array1.slice(0, 3);
console.log(novoArray);

//Objeto
//manipulando e desestruturando um objectiv
let object = {string: 'string', number: 1, boolean: true, array: ["array"], objectInterno: {objectInterno: 'objeto interno'}};
console.log(object);
console.log(object.boolean);
console.log(object.number);
console.log(object.objectInterno);
console.log(object.array);
console.log(object.string);

//desestruturação do objeto
var string = object.string;
console.log(string);

var arrayInterno = object.array;
console.log(arrayInterno);

var {string, boolean, objectInterno} = object;
console.log(string, boolean, objectInterno);