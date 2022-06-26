var jogador1 = 0;
var jogador2 = 0;
var placar;
jogador1 = 1;

//if ternario
jogador1 != -1 && jogador2 != -1 ? console.log('Os jogadores são validos') : console.log('Jogadores inválidos');
//usando if
if(jogador1 > 0 && jogador2 == 0){
    console.log('Jogador1 marcou ponto!');
    placar = jogador1 > jogador2;
//usando else if
}else if(jogador2 > 0 && jogador1 == 0){
    console.log('Jogador2 marcou ponto!');
    placar = jogador2 > jogador1;
//usando else
}else{
    console.log('Ninguem marcou ponto!');
}

switch(placar){
    case placar = jogador1 > jogador2:
        console.log('Jogador1 ganhou');
        break;
    case placar = jogador2 > jogador1:
        console.log('Jogador2 ganhou');
        break;
    default:
        console.log('Ninguem ganhou');
}

//Estrutura de repetição

let array = ['array1', 'array2', 'array3', 'array4', 'array5'];
let object = {propriedade1: 'valor1', propriedade2: 'valor2', propriedade3: 'valor3'}

//FOR
//for - executa uma instrução até que seja falsa
for(let indice = 0; indice < array.length ;indice++){
    console.log(indice);
}

//for/in executa repetição a partir de uma propriedade
//com array
for(let i in array){
    console.log(i);
}

//com object
for(i in object){
    console.log(i)
}

//for/of executa repetição apartir do valor
//com array
for(i of array){
    console.log(i);
}

//com object (NÃO SE PODE USAR O FOR/OF COM OBJETOS)

//WHILE
var a = 0;
while(a < 10){
    a++;
    console.log(a);
}

//DO/WHILE
do{
    a++;
    console.log(a);
}while(a < 10)